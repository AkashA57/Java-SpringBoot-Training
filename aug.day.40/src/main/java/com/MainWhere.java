package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainWhere {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		// ________________________________

		String hql = "from Employee where empid =:empid";
		Query query = session.createQuery(hql);
		query.setInteger("empid", 4);
		List<Employee> employeeList = query.list();
		for (Employee xyz : employeeList) {
			//System.out.println(xyz);
			System.out.println(xyz.getName()+ " "+xyz.getSalary());
		}
		// _________________________________
		session.getTransaction().commit();
		session.close();
	}

}
