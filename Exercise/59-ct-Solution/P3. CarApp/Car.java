package B;

public class Car extends Vehicle {

	int engine;
	Car(String model, int engine)
	{
		super(model); //call Vehicle (String model)
		this.engine = engine;
	}
	void showModel()
	{
		System.out.println("Model: "+model);//System.out.print is ok but i like System.out.println
	}

}
