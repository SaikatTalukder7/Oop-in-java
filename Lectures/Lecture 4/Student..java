package Lecture4;

class Student {

	String name;
	int age;
	Student() {
		System.out.println("Hello Saikat");
	}
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name +" "+ age);
	}
}
