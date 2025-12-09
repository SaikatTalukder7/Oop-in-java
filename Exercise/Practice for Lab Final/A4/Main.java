package A4;

public class Main {

	public static void main(String[] args) {

		Animal refer = new Dog();
		refer.makeSound();
		
		((Dog) refer).fetch();

	}

}
