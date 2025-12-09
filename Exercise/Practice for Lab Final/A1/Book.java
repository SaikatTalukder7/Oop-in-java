package A1;

public class Book {

	String title;
	String author;
	int number_of_page;

	Book(String title, String author, int number_of_page){
		this.title = title;
		this.author = author;
		this.number_of_page = number_of_page;
	}
	
	void displayInformation() {
		
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Page Count: "+number_of_page);
	}
	
}
