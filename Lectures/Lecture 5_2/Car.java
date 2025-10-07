package Lecture5_2;

public class Car {

	String model_name;
	float speed;
	int year;
	String colour;

	public Car(String model_name,float speed,int year)
	{
		this.model_name = model_name;
		this.speed = speed;
		this.year = year;
	}
	Car(String model_name,float speed,int year,String colour)
	{
		this.model_name = model_name;
		this.speed = speed;
		this.year = year;
		this.colour = colour;

	}
	void carDetails()
	{
		System.out.println("Model Name: "+ model_name +"\n"+"Current Speed: "+ speed +"\n"+"Model Year: "+year+"\n");
		System.out.println("Model Name: "+ model_name +"\n"+"Current Speed: "+ speed +"\n"+"Model Year: "+year+"\n"+"Colour of The Car: "+ colour +"\n");

	}

}
