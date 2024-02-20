package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
	
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		//================================================
		//fetch employee with id(primary key)=2
		
		Employee e1=session.load(Employee.class,20);//if u r very sure  about existence of primary key in db
		//System.out.println(e1);   //20
		//System.out.println(e1.getEmpid());
		//System.out.println(e1.getName());   ///throw an exception
                //System.out.println(e1.getSalary());
		
		Employee e2=session.get(Employee.class,2);//not sure about existence of primary key in db
		System.out.println(e2);//null if 20 not present	
		
		
		
		//Employee e3=session.load(Employee.class,82);//if u r very sure  about existence of primary key in db
		//System.out.println(e3);
		//System.out.println(e3.getEmpid());
		//System.out.println(e3.getName());
		
		Employee e4=session.get(Employee.class,87);//not sure about existence of primary key in db
		System.out.println(e4);//null if 87 not present	
		
		
		
		
		
		
		
		//================================================
		
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
