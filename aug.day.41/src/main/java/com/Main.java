package com;

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
		
//		  Author a1=new Author("Sarita","sr@gmail.com"); 
//		  Book b1=new Book("python","basic",a1); 
//		  session.save(b1); //no need to save a1, because when u r saving child class object 
		                     //by default parent class object is going to saved.
		 
		
//		  Author a2=new Author("Lal","l@gmail.com"); 
//		  Book b2=new Book("pascal","advanced",a2); 
//		  session.save(b2);
//		 
//		
//		
//		  Author a3=new Author("Akash","a@gmail.com"); 
//		  session.save(a3);
//		 
		
		
		  Book book=session.get(Book.class, 3); 
		  System.out.println(book);
		  System.out.println(book.getAuthor().getName());
		  System.out.println(book.getAuthor().getEmail());
//		 
		
		//_____________________
		session.getTransaction().commit();
		session.close();
		
		
		
		

	}

}
