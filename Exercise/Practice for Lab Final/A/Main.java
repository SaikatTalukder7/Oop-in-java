package A;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car("Toyota", 155.5, 2003);
		c1.ShowDetails();
		
		if(c1.isFast())
		{
			System.out.println("Car is Fast");

		}
		else {
			System.out.println("Car is not Fast");
		}

	}

}
