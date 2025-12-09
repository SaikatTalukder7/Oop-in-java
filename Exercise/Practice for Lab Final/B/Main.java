package B;

public class Main {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.pet_name = "Kitty";
		c.age = 2;
		c.displayInfo();
		c.meow();
		
		Dog d = new Dog();
		d.pet_name = "Leo";
		d.age = 2;
		d.displayInfo();
		d.bark();

	}

}
