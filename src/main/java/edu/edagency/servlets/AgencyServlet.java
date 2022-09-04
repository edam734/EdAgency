package edu.edagency.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.edagency.dao.AgentsDAO;
import edu.edagency.dao.UsersDAO;
import edu.edagency.entities.Agent;
import edu.edagency.entities.EyeColor;
import edu.edagency.entities.Gender;
import edu.edagency.entities.ShirtSize;
import edu.edagency.entities.User;
import edu.edagency.utils.EdAgencyUtils;

@WebServlet("/home")
public class AgencyServlet extends HttpServlet {

	private static final long serialVersionUID = 5472671999562754379L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = req.getParameter("page");
		if (page == null || page.isEmpty()) {
			listAgents(req, resp);
		} else {
			switch (page) {
			case "list":
				listAgents(req, resp);
				break;
			case "goProfile":
				goProfile(req, resp);
				break;
			case "goToAdd":
				goAdd(req, resp);
				break;
			default:

			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String operation = req.getParameter("form");
		if (operation != null) {

			switch (operation) {
			case "add":
				addAgent(req, resp);
				break;
			case "update":
				goToUpdateAgent(req, resp);
				break;
			case "updateAgentOperation":
				updateAgent(req, resp);
				break;
			case "delete":
				deleteAgent(req, resp);
				break;
			case "registerAdmin":
				registerAdmin(req, resp);
				break;
			default:

			}
		}
		
	}

	private void registerAdmin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPass");
		User admin = new User();
		admin.setEmail(email);
		admin.setPassword(password);
		new UsersDAO().register(admin);
		listAgents(req, resp);
	}

	private void listAgents(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Agent> agents = new AgentsDAO().getAgents();
		req.setAttribute("listAgents", agents);
		List<User> users = new UsersDAO().getUsers();
		req.setAttribute("listUsers", users);
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
	}

	private void goProfile(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/profile.jsp").forward(req, resp);
	}

	private void goAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> genders = Gender.getList();
		req.setAttribute("genders", genders);
		List<String> eyes = EyeColor.getEyes();
		req.setAttribute("eyes", eyes);
		List<String> shirts = ShirtSize.getShirts();
		req.setAttribute("shirts", shirts);
		req.getRequestDispatcher("addAgent.jsp").forward(req, resp);
	}

	private void addAgent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Agent newAgent = buildAgentFromParameters(req, resp);
		new AgentsDAO().addAgent(newAgent);
		listAgents(req, resp);
	}

	private void goToUpdateAgent(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<String> genders = Gender.getList();
		req.setAttribute("genders", genders); // M, F
		List<String> eyes = EyeColor.getEyes();
		req.setAttribute("eyes", eyes);
		List<String> shirts = ShirtSize.getShirts();
		req.setAttribute("shirts", shirts);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}

	private void updateAgent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Agent updatedAgent = buildAgentFromParameters(req, resp);
		updatedAgent.setId(Integer.valueOf(req.getParameter("agentId"))); // set also the id
		new AgentsDAO().updateAgent(updatedAgent);
		listAgents(req, resp);
	}

	private void deleteAgent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.valueOf(req.getParameter("agentId"));
		AgentsDAO dao = new AgentsDAO();
		dao.deleteAgent(id);
		listAgents(req, resp);
	}
	
	private Agent buildAgentFromParameters(HttpServletRequest req, HttpServletResponse resp) {
		Agent agent = new Agent();
		agent.setName(req.getParameter("agentName"));
		agent.setEmail(req.getParameter("agentEmail"));
		agent.setGender(Gender.toGender(req.getParameter("agentGender")));
		agent.setBirthdate(EdAgencyUtils.parseDate(req.getParameter("agentBirthdate")));
		agent.setEyes(EyeColor.toEye(req.getParameter("agentEyes")));
		agent.setHeight(Float.valueOf(req.getParameter("agentHeight")));
		agent.setShirt(ShirtSize.toShirtSize(req.getParameter("agentShirt")));
		agent.setShoes(Integer.valueOf(req.getParameter("agentShoes")));
		agent.setInstagram(req.getParameter("agentInstagram"));
		return agent;
	}
	
}


