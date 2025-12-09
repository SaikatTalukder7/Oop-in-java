package A1;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("Life of Saikat", "Saikat Talukder", 500);
		b1.displayInformation();

		Book b2 = new Book("Life of", "Saikat Talukder", 500);
		b2.displayInformation();
	}

}
