package edu.edagency.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import edu.edagency.dao.AgentsDAO;
import edu.edagency.entities.Agent;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 5472671999562754379L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		AgentsDAO dao = new AgentsDAO();
		testAddAgent(out, dao);
		testGetAgents(out, dao);
		out.write("<h1>==========</h1>");
//		Agent agent = testGetAgent(out, dao, 7);
//		agent.setName("Oissss");
		Agent agent = new Agent();
		agent.setId(7);
		agent.setName("Oissss");
		testUpdateAgent(out, dao, agent);
		testGetAgents(out, dao);
		out.write("<h1>==========</h1>");
		testDeleteAgent(out, dao, 5);
		testGetAgents(out, dao);
	}
	
	private void testDeleteAgent(PrintWriter out, AgentsDAO dao, int id) {
		dao.deleteAgent(id);
	}

	private Agent testGetAgent(PrintWriter out, AgentsDAO dao, int i) {
		return dao.getAgentById(i);
	}

	private void testUpdateAgent(PrintWriter out, AgentsDAO dao, Agent agent) {
		dao.updateAgent(agent);
	}

	private void testAddAgent(PrintWriter out, AgentsDAO dao) {
		Agent agent = new Agent();
		agent.setId(7);
		agent.setName("Oi");
		dao.addAgent(agent);
	}

	private void testGetAgents(PrintWriter out, AgentsDAO dao) {
		List<Agent> agents = dao.getAgents();
		for (Agent agent : agents) {
			out.write(agent.toString() + "</br>");
		}
	}

}
