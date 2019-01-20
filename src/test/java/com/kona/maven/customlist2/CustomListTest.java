package com.kona.maven.customlist2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import junit.framework.TestCase;

public class CustomListTest {

	@Test
	public void testAdd() {
		CustomList<Book> list = new CustomList<Book>();
		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		list.add(book1);
		assertNotNull(list);
		assertEquals(book1, list.get(0));

		Book book2 = new Book("Stephen Hawking", "Harry Potter", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
		list.add(book2);
		assertEquals(book2, list.get(1));
	}

	@Test
	public void testSize() {
		CustomList<Book> list = new CustomList<Book>();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
		Book book2 = new Book("Stephen Hawking", "Harry Potter", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.add(book6);

		assertEquals(6, list.size());
	}



	@Test
	public void testRemove() {
		CustomList<Book> list = new CustomList<Book>();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
		Book book2 = new Book("Stephen Hawking", "Harry Potter", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.add(book6);
		
		assertEquals(book1, list.get(0));
		list.remove(book1);
		assertEquals(book2, list.get(0));
		
	}

	@Test
	public void testGet() {
		CustomList<Book> list = new CustomList<Book>();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
		list.add(book1);
		assertEquals(book1, list.get(0));
		
	}

	@Test
	public void testClear() {
		CustomList<Book> list = new CustomList<Book>();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
		Book book2 = new Book("Stephen Hawking", "Harry Potter", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.add(book6);
		
		assertEquals(book1, list.get(0));
		assertEquals(book2, list.get(1));
		assertEquals(book3, list.get(2));
		assertEquals(6, list.size());
		list.clear();
		assertEquals(null, list.get(0));
		assertEquals(null, list.get(1));
		assertEquals(null, list.get(2));
		assertEquals(0, list.size());
		
	}

	@Test
	public void testAddAll() {

	}

}
