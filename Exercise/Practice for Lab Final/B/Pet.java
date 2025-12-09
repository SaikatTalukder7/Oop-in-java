package B;

public class Pet {

	String pet_name;
	int age;
	
	int displayInfo() {
		System.out.println("Name: "+pet_name);
		System.out.println("Age: "+ age);
		return age;
	}
}

