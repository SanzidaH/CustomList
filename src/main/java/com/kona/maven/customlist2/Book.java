package com.kona.maven.customlist2;

import java.time.LocalDate;

public class Book {

	  String authorName;
	    String name;
	    String isbn;
	    LocalDate publishDate;
	    int price;

	    public Book(String authorName, String name, String isbn, LocalDate publishDate, int price) {
	        this.authorName = authorName;
	        this.name = name;
	        this.isbn = isbn;
	        this.publishDate = publishDate;
	        this.price = price;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public LocalDate getPublishDate() {
	        return publishDate;
	    }

	    public int getPrice() {
	        return price;
	    }
	    
}
