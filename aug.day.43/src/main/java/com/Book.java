package com;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Book {

	private Long bookID;
	private String bookName;
	private Set<Author> authors;
	
	public Book() {
		
	}
	
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	public Long getBookID() {
		return bookID;
	}

	public void setBookID(Long bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="author_book", 
	joinColumns=@JoinColumn(name="book_id"), 
	inverseJoinColumns=@JoinColumn(name="author_id"))
	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
}
