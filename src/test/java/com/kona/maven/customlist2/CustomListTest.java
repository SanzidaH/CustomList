package com.kona.maven.customlist2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import junit.framework.TestCase;

public class CustomListTest {

	public CustomList<Book> getList() {

		CustomList<Book> list = new CustomList<Book>();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		Book book2 = new Book("Stephen Hawking", "‎A Brief History of Time", "113:222",
				LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),
				600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.add(book6);

		return list;

	}

	@Test
	public void testAdd() {
		CustomList<Book> list = getList();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		Book book2 = new Book("Stephen Hawking", "‎A Brief History of Time", "113:222",
				LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),
				600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		assertNotNull(list);

		assertEquals(book1, list.get(0));
		assertEquals(book2, list.get(1));
		assertEquals(book3, list.get(2));
		assertEquals(book4, list.get(3));
		assertEquals(book5, list.get(4));
		assertEquals(book6, list.get(5));
		
		assertEquals(6, list.size());
		Book book7 = new Book("Paulo Coelho", "The Alchemist", "989:778", LocalDate.of(1988, Month.JULY, 21), 250);
	    list.add(book7);
	    assertEquals(7, list.size());
	    assertEquals(book7, list.get(6));
	}

	@Test
	public void testSize() {
		CustomList<Book> list = getList();
		assertEquals(6, list.size());
	}

	@Test
	public void testRemove() {
	    
		CustomList<Book> list = getList();
		
		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		Book book2 = new Book("Stephen Hawking", "‎A Brief History of Time", "113:222",
				LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),
				600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		
		assertEquals(book1, list.get(0));
		assertEquals(6, list.size());
		
		list.remove(book1);
		
		assertEquals(book2, list.get(0));
		assertEquals(5, list.size());
		
		list.remove(book2);
		
		assertEquals(book3, list.get(0));
		assertEquals(4, list.size());
		
		list.remove(book3);
		
		assertEquals(book4, list.get(0));
		assertEquals(3, list.size());
		list.remove(book4);
		
		assertEquals(book5, list.get(0));
		assertEquals(2, list.size());
		
		list.remove(book5);
		
		assertEquals(book6, list.get(0));
		assertEquals(1, list.size());
		
		list.remove(book6);
		
		assertEquals(null, list.get(0));
		assertEquals(0, list.size());		
		
	}

	@Test
	public void testGet() {
		CustomList<Book> list = getList();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		Book book2 = new Book("Stephen Hawking", "‎A Brief History of Time", "113:222",
				LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),
				600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		assertNotNull(list);

		assertEquals(book1, list.get(0));
		assertEquals(book2, list.get(1));
		assertEquals(book3, list.get(2));
		assertEquals(book4, list.get(3));
		assertEquals(book5, list.get(4));
		assertEquals(book6, list.get(5));

	}

	@Test
	public void testClear() {
		CustomList<Book> list = getList();

		Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),
				600);
		Book book2 = new Book("Stephen Hawking", "‎A Brief History of Time", "113:222",
				LocalDate.of(1988, Month.JULY, 21), 550);
		Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
		Book book4 = new Book("Rabindranath Tagore", "GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
		Book book5 = new Book("Naseem Hijazi", "The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21),
				600);
		Book book6 = new Book("Anisul Hoque", "Maa", "980:678", LocalDate.of(200, Month.JULY, 21), 250);

		
		assertEquals(book1, list.get(0));
		assertEquals(book2, list.get(1));
		assertEquals(book3, list.get(2));
		assertEquals(book4, list.get(3));
		assertEquals(book5, list.get(4));
		assertEquals(book6, list.get(5));
		
		assertEquals(6, list.size());
		
		list.clear();
		
		assertEquals(null, list.get(0));
		assertEquals(null, list.get(1));
		assertEquals(null, list.get(2));
		assertEquals(null, list.get(3));
		assertEquals(null, list.get(4));
		assertEquals(null, list.get(5));
		
		assertEquals(0, list.size());
	

	}

	@Test
	public void testAddAll() {
		CustomList<Book> list = getList();
		CustomList<Book> listToBeAdded = new CustomList<Book>();
		
		Book book7 = new Book("Paulo Coelho", "The Alchemist", "989:778", LocalDate.of(1988, Month.JULY, 21), 250);
		Book book8 = new Book("Maxim Gorky", "Mother", "789:188", LocalDate.of(1906, Month.JULY, 21), 259);
		
		assertEquals(6, list.size());
		
		listToBeAdded.add(book7);
		listToBeAdded.add(book8);
		
		assertEquals(null, list.get(6));
		assertEquals(null, list.get(7));
		
		list.addAll(listToBeAdded);
		
		assertEquals(8, list.size());
		
		assertEquals(book7, list.get(6));
		assertEquals(book8, list.get(7));
	}

}
