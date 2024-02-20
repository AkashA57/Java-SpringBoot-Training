package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateMain {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		// ________________________________
		
		String hql = "update Employee set name = :name where empid = :empid";
		Query query = session.createQuery(hql);
		query.setParameter("name", "rezwan");
		query.setParameter("empid", 1);

		int rowsAffected = query.executeUpdate();
		if (rowsAffected > 0) {
		System.out.println("Updated " + rowsAffected + " rows.");
		}

		
		
		
		
		// _________________________________
		session.getTransaction().commit();
		session.close();
	}

}
