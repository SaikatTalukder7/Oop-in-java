package B;

public class Vehicle {

	String model;
	Vehicle(String model)
	{
		this.model = model;
	}
	void showModel() //remove static
	{
		System.out.println("Model: "+model); //System.out.print is ok but i like System.out.println
	}

}
