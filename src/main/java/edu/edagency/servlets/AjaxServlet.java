package edu.edagency.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.edagency.utils.EdAgencyUtils;

@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {

	private static final long serialVersionUID = 3534184465058178384L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		if (email != null) {
			resp.setContentType("text/plain");
			PrintWriter out = resp.getWriter();
			boolean isEmailValid = EdAgencyUtils.isEmailValid(email);
			out.print("O email eh: " + (isEmailValid ? "válido" : "inválido"));
		}
	}
}
