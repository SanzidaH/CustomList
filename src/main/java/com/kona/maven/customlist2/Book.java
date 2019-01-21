package com.kona.maven.customlist2;

import java.time.LocalDate;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (publishDate == null) {
			if (other.publishDate != null)
				return false;
		} else if (!publishDate.equals(other.publishDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", name=" + name + ", isbn=" + isbn + ", publishDate=" + publishDate
				+ ", price=" + price + "]";
	}
	
	

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

//	@Override
//	public boolean equals(Object o) {
//
//		if (o == this)
//			return true;
//		if (!(o instanceof Book)) {
//			return false;
//		}
//		Book book = (Book) o;
//		return price == book.price && Objects.equals(this.name, book.name)
//				&& Objects.equals(this.authorName, book.authorName) && Objects.equals(this.isbn, book.isbn)
//				&& Objects.equals(this.publishDate, book.publishDate);
//	}

//	    @Override
//	    public int hashCode() {
//	        return Objects.hash(authorName, name, isbn, publishDate, price );
//	    }

//		@Override
//		public int hashCode() {
//			// TODO Auto-generated method stub
//			 int result = 17;
//		        result = 31 * result + name.hashCode();
//		        result = 31 * result + price;
//		        result = 31 * result + authorName.hashCode();
//		        result = 31 * result + isbn.hashCode();
//		        result = 31 * result + publishDate.hashCode();
//		        return result;
//		}
//
//		@Override
//		public boolean equals(Object o) {
//			// TODO Auto-generated method stub
//			 if (o == null) return false;
//
//		       final Book book = (Book) o;
//
//		        return book.name.equals(name) &&
//		        	   book.authorName.equals(authorName) &&
//		        	   book.isbn.equals(isbn)&&	
//		        	   book.price == price &&
//		        	   book.publishDate.isEqual(publishDate);
//		}

//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			if (obj == null) {
//				return false;
//			}
//
//			if (!Book.class.isAssignableFrom(obj.getClass())) {
//				return false;
//			}
//
//			final Book other = (Book) obj;
//			if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
//				return false;
//			}
//			
//			if ((this.authorName == null) ? (other.authorName != null) : !this.authorName.equals(other.authorName)) {
//				return false;
//			}
//			
//			if ((this.isbn == null) ? (other.isbn != null) : !this.isbn.equals(other.isbn)) {
//				return false;
//			}
//			
//			if ((this.publishDate == null) ? (other.publishDate != null) : !this.publishDate.equals(other.publishDate)) {
//				return false;
//			}
//
//			if (this.price != other.price) {
//				return false;
//			}
//
//
//			return true;
//
//		}

}
