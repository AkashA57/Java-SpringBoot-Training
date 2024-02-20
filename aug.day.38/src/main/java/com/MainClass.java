package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		//given below 3 statements are fixed
		//SessionFactory reading all the information related to database configuration
		//and its creating an object. It's a factory of session.
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		// obtains the session
		//If you want to interact with database, then u must need Session
		Session session = sf.openSession();
		session.beginTransaction();
		//given above 3 statements are fixed

		Student s1=new Student(1,"Durga",29);
		session.save(s1);
		
		
		Student s2=new Student(2,"Sarita",23);
		session.save(s2);
		
		Student s3=new Student(3,"Sunita",24);
		session.save(s3);
		
		
		session.getTransaction().commit();
		session.close();
		//given above 2 statements are fixed

	}

}
