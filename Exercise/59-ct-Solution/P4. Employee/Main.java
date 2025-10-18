package C;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jhon");
		Employee e2 = new Employee("Saikat"); //there is no constructor with only int
		Employee e3 = new Employee("Anna",25);
		Employee e4 = new Employee(); //there is no constructor without parameter
		e1.Employee();
		e2.Employee(); // in void Employee there is no parameter.
		Employee e5 = new Employee("Sam", 22); //there is no constructor with two String
		Employee e6 = new Employee("Kate", 28);
		
		System.out.println(e1.name);
		
	}

}
