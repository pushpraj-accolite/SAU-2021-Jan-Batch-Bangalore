package com.au.assignment;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Library {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String publisher;
	
	@Column
	private String author;
	
	@Column
	private String language;
	
	@Column
	private String genre;
	
	public Library() {
		
	}
	
	public Library(String name, String publisher, String author, String language, String genre) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.language = language;
		this.genre = genre;
		
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public String getLanguage() 
	{
		return language;
	}
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	public String getGenre() 
	{
		return genre;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	
}