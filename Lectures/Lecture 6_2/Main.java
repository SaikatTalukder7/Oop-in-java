package Lecture6_2;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		Student s1 = new Student();
		p1.showinfo("Saikat talukder", 241115051);
		s1.study();
		
		Teacher t1 = new Teacher();
		p1.showinfo("Khudeja Khanom Anwara", 241);
		t1.teach();
	}

}
