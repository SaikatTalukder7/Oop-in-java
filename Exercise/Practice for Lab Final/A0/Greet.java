package A0;

public class Greet {

	String name;
	int age;
	Greet(){
		System.out.println("Hello!");
	}
	Greet(String name){
		System.out.println("Name: "+name);
	}
	Greet(String name, int age){
		System.out.println("Name "+name+" and Age "+age);
	}
}
