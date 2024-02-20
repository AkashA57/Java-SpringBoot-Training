package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		//================================================
		
	
		
		Employee e2=session.get(Employee.class,2);
		if(e2!=null){
			System.out.println(e2);	
			session.delete(e2);
			System.out.println(e2);		
			}
		
		Employee e3=session.get(Employee.class,2);
		System.out.println(e3);	
		e3.setName("robert");
		e3.setSalary(200);
		
	
		
		
		//================================================
		
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
