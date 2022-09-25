package edu.edagency.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import jakarta.ws.rs.client.Client;
//import jakarta.ws.rs.client.ClientBuilder;
//import jakarta.ws.rs.client.Entity;
//import jakarta.ws.rs.client.WebTarget;
//import jakarta.ws.rs.core.Response;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import edu.edagency.utils.GoogleToken;
import edu.edagency.utils.RequestTokenParams;
import edu.edagency.utils.User;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {

	private static final long serialVersionUID = 7620039300811744328L;

	private static Client client = ClientBuilder.newClient();
	private WebTarget googleTokenServer = client.target("https://www.googleapis.com/oauth2/v4/token");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// step 2
		String code  = req.getParameter("code");
		String clientId = "542478063312-6lr433uksoma433b236td1uqekt0ejm4.apps.googleusercontent.com";
		String clientSecret = "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";
		String redirectUri = "http://localhost:8082/EdAgency/success";
		String grantType = "authorization_code";

		RequestTokenParams requestTokenParams = new RequestTokenParams(code, clientId, clientSecret, redirectUri, grantType);
		Response tokenInJson = googleTokenServer.request().post(Entity.json(requestTokenParams));
		
		// step 3
		GoogleToken googleToken = tokenInJson.readEntity(GoogleToken.class);
		// fazer outro pedido
		WebTarget googleUserInfoAPI = client
				.target("https://www.googleapis.com/oauth2/v2/userinfo?access_token=" + googleToken.getAccess_token());
		
		Response userInfo = googleUserInfoAPI.request().get();
		User user = userInfo.readEntity(User.class);
		
		req.setAttribute("user", user);
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
		
	}
}
