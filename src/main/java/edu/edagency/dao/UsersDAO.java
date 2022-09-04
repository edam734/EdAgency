package edu.edagency.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.edagency.entities.User;

public class UsersDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
			.buildSessionFactory();
	
	public boolean register(User user) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return true;
	}
	
	public List<User> getUsers() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<User> users = session.createQuery("FROM User", User.class).getResultList();
		session.getTransaction().commit();
		return users;
	}
}
