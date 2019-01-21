package com.kona.maven.customlist2;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static CustomList<Book> getList() {

		 Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
	        Book book2 = new Book("Stephen Hawking", "A Brief History of Time", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
	        Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
	        Book book4 = new Book("Rabindranath Tagore","GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
	        Book book5 = new Book("Naseem Hijazi","The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21), 600);
	        Book book6 = new Book("Anisul Hoque", "Maa", "980:678",LocalDate.of(200, Month.JULY, 21), 250);

	        System.out.println("___function___");
	        CustomList<Book> list = new CustomList<Book>();
	        list.add(book1);
	        list.add(book2);
	        list.add(book3);
	        list.add(book4);
	        list.add(book5);
	        list.add(book6);

		return list;

	}
	
	
    public static void main( String[] args )
    {
       
        System.out.println("___Driver Class___");
        
        Book book1 = new Book("Dan Brown", "‎The Da Vinci Code", "956:789:567", LocalDate.of(2003, Month.APRIL, 23),600);
        Book book2 = new Book("Stephen Hawking", "A Brief History of Time", "113:222", LocalDate.of(1988, Month.JULY, 21), 550);
        Book book3 = new Book("A P J Abdul Kalam", "Wings of Fire", "411:622", LocalDate.of(2000, Month.JULY, 21), 250);
        Book book4 = new Book("Rabindranath Tagore","GORA", "161:242", LocalDate.of(1880, Month.JULY, 21), 550);
        Book book5 = new Book("Naseem Hijazi","The Caravan of Hijaz", "161:242", LocalDate.of(1998, Month.JULY, 21), 600);
        Book book6 = new Book("Anisul Hoque", "Maa", "980:678",LocalDate.of(200, Month.JULY, 21), 250);

        System.out.println("___ADD list___");
        CustomList<Book> list = new CustomList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        
        list.displayCustomList();
        System.out.println("book1 from list: "+list.get(0).getName());
        System.out.println("Size: "+list.size());
      
        
        CustomList<Book> list3 = new CustomList<Book>();
        list3 = getList();
        list3.displayCustomList();
        System.out.println("book1 from function: "+list3.get(0).getName());
        System.out.println("Size: "+list.size());

      
        
        System.out.println("___ADD list2___");
        CustomList<Book> list2 = new CustomList<Book>();
        list2.add(book1);
        list2.add(book2);
        
        list2.displayCustomList();
        System.out.println("Size: "+list2.size());
        
        System.out.println("<<___ADDall(list2) ___>>");
        list3.addAll(list2);
        list3.displayCustomList();
        System.out.println("list 3 Size: "+list3.size());

        System.out.println("___Remove book4___");
        
        list.remove(book4);
        
        list.displayCustomList();
        System.out.println("Size: "+list.size());
        
        System.out.println("___get index 1___");
        
        System.out.println("get : "+list.get(1));
        
        


        System.out.println("___clear___");        
        list.clear();
        
        list.displayCustomList();
        System.out.println("Size: "+list.size());
        
   
        
//        System.out.println("____________________");
//        
//     // create an empty array list with an initial capacity
//        ArrayList<String> arrlist = new ArrayList<String>(5);
//
//        // use add() method to add values in the list
//        arrlist.add("G");
//        arrlist.add("E");
//        arrlist.add("F");
//        arrlist.add("M");
//        arrlist.add("E");
//
//        System.out.println("Size of list: " + arrlist.size());
//
//        // let us print all the values available in list
//        for (String value : arrlist) {
//           System.out.println("Value = " + value);
//        }  
//        
//        // Removes first occurrence of "E"
//      //  arrlist.remove("E");
//        arrlist.set(1, null);
//        System.out.println("Now, Size of list: " + arrlist.size());
//        
//        for (String value : arrlist) {
//            System.out.println("Value = " + value);
//         } 
    }
}


