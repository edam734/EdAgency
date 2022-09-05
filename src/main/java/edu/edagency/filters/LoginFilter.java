package edu.edagency.filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class LoginFilter implements Filter {

	private static final Set<String> ALLOWED_PATHS = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList(null, "", "signin", "login", "list", "profileAgent")));

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession(false);
		String page = request.getParameter("page");
		boolean allowedPath = ALLOWED_PATHS.contains(page);
		boolean loggedIn = (session != null && session.getAttribute("loggedInUser") != null);

		if (loggedIn || allowedPath) {
			chain.doFilter(req, res);
		} else {
			response.sendRedirect(request.getContextPath() + "/agency?page=signin");
		}

	}

}
