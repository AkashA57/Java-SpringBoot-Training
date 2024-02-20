package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		//================================================
		Employee e1=new Employee("Sunita",200);
		Employee e2=new Employee("zaved",300);
		
		int key=(int)session.save(e1);//returns primary key
		System.out.println("==========================================================="+key);
		session.save(e2);
		
		Employee e3=new Employee("Rezwan",700);
		Employee e4=new Employee("Mohd Khan",900);
		
		session.persist(e3);//does not return anything
		session.persist(e4);
		
		
		//================================================
		
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
