package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		//_____________________
		
		Product p1 = new Product("HP", "laptop", 400);
		Product p2 = new Product("Lenovo", "laptop", 300);
		
		List<Product> productList1 = new ArrayList<>();
		productList1.add(p1);
		productList1.add(p2);
		
		Category c1 = new Category("laptop", productList1);
		
		Product p3 = new Product("samsung", "mobile", 100);
		Product p4 = new Product("motorola", "mobile", 700);
		List<Product> productList2 = new ArrayList<>();
		productList2.add(p3);
		productList2.add(p4);
		Category c2 = new Category("mobile", productList2);
		
		session.save(c1);
		session.save(c2);
			
		//_____________________
		session.getTransaction().commit();
		session.close();

	}

}
