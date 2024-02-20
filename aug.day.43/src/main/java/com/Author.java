package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	private Long authorId;
	private String authhorName;
	
	public Author() {
		
	}

	public Author(String authorName) {
		super();
		this.authhorName = authorName;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="author_id")
	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Column(name="author_name")
	public String getAuthhorName() {
		return authhorName;
	}

	public void setAuthhorName(String authhorName) {
		this.authhorName = authhorName;
	}
}

