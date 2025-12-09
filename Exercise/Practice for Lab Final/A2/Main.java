package A2;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.person_name = "Saikat";
		s1.id = 51;
		s1.showInfo();
		s1.study();

		Teacher t1 = new Teacher();
		t1.person_name = "Anwara";
		t1.id = 60;
		t1.showInfo();
		t1.teach();

	}

}
