package a_10_12_2023_library_shoppingCart_employees;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<String> bookTitles;
	
	public static int bookCount;
	
	public Library() {
		bookTitles = new ArrayList<String>();
		bookCount = 0;
	}
	
	public void addBook(String title) {
		bookTitles.add(title);
		update_bookCount();
	}
	
	public String toString() {
		return "Library Catalog: " + String.join(", ", bookTitles);
	}
	
	private void update_bookCount() {
		bookCount = bookTitles.size();
	}
	
	public static void main(String args[]) {
		Library lib = new Library();
		lib.addBook("book one");
		lib.addBook("book two");
		System.out.println("There are " + Library.bookCount + " books in the library.");
		System.out.println(lib);
		
	}
	
}
