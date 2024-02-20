package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteOpMain {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		// ________________________________
		
		String hql = "delete from Employee where empid =:empid";
				Query query = session.createQuery(hql);
				query.setParameter("empid", 5);
				
				int rowsAffected = query.executeUpdate();
				      if (rowsAffected > 0) {
				               System.out.println("Deleted " + rowsAffected + " row.");
				      }

		
		
		
		
		
		// _________________________________
				session.getTransaction().commit();
				session.close();

	}

}
