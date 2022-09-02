package edu.edagency.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.edagency.entities.Agent;

public class AgentsDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Agent.class)
			.buildSessionFactory();

	public List<Agent> getAgents() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Agent> agents = session.createQuery("SELECT a FROM Agent a", Agent.class).getResultList();
		session.getTransaction().commit();
		return agents;
	}

	public boolean addAgent(Agent agent) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.persist(agent);
		session.getTransaction().commit();
		return true;
	}

	public boolean updateAgent(Agent agent) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.update(agent);
		session.getTransaction().commit();
		return true;
	}

	public boolean deleteAgent(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Agent persistedAgent = session.load(Agent.class, id);
		if (persistedAgent != null) {
			session.delete(persistedAgent);
		}
		session.getTransaction().commit();
		return true;
	}

	public Agent getAgentById(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Agent agent = session.get(Agent.class, id);
		session.getTransaction().commit();
		return agent;
	}
}
