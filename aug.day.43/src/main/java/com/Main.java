package com;

import java.util.HashSet;
import java.util.Set;

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
		
		
		// create different authors
		Author author1 =new Author("Brian");
		Author author2 =new Author("John");

		// create different set of Authors
		Set<Author> javaAuthors =new HashSet<Author>();
		Set<Author> cAuthors =new HashSet<Author>();
		Set<Author> pascalAuthors =new HashSet<Author>();
		
		//put different authors to different set of authors
		javaAuthors.add(author1);
		javaAuthors.add(author2);
		cAuthors.add(author1);
		pascalAuthors.add(author2);
		
		//create different books
		Book book1 = new Book("Java");
		Book book2 = new Book("C");
		Book book3 = new Book("Pascal");
		
		//attach different set of authors to different books
		book1.setAuthors(javaAuthors);
		book2.setAuthors(cAuthors);
		book3.setAuthors(pascalAuthors);
		
		//save child(not parent)
		session.save(book1);
		session.save(book2);
		session.save(book3);
		
		//_____________________
		session.getTransaction().commit();
		session.close();
	}

}
