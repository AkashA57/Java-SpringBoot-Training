package com;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {
	
	int id;
	String title;
	String description;
	Author author;
	
	public Book() {
		super();
			}
	public Book(String title, String description, Author author) {
		super();
		
		this.title = title;
		this.description = description;
		this.author = author;
	}
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="book_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id")
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + "]";
	}
	
	
	
	
	

}
