package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		//________________________________
		
		//want to fetch all the records from employee table through HQL
		
		String hql="from Employee";
		Query query=session.createQuery(hql);
		
		List<Employee> listOfEmployee=query.list();
		
		for(Employee employee:listOfEmployee) {
			
			//System.out.println(employee);
			
			//System.out.println(employee.getName());
			System.out.println(employee.getName()+ " "+employee.getSalary());
		}
		
		
		
		
		
		
		//_________________________________
				session.getTransaction().commit();
				session.close();
		
	}

}
