package Lecture5_1;

public class Book {
	
	String title;
	String author;
	int number_of_pages;
	String colour;

	public Book(String title,String author,int number_of_pages)
	{
		this.title = title;
		this.author = author;
		this.number_of_pages = number_of_pages;
	}
	Book(String title,String author,int number_of_pages,String colour)
	{
		this.title = title;
		this.author = author;
		this.number_of_pages = number_of_pages;
		this.colour = colour;

	}
	void shelf()
	{
		System.out.println("Title: "+ title +"\n"+"Author: "+ author +"\n"+"Number_of_pages: "+number_of_pages+"\n");
		System.out.println("Title: "+ title +"\n"+"Author: "+ author +"\n"+"Number_of_pages: "+number_of_pages+"\n"+"Colour of the book cover: "+ colour +"\n");

	}

}
