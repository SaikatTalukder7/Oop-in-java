package A;

public class Car {

	String model_name;
	double speed;
	int year;
	
	Car(String model_name, double speed, int year){
		this.model_name = model_name;
		this.speed =  speed;
		this.year = year;
		
	}
	
	void ShowDetails() {
		System.out.println("Name: "+ model_name);
		System.out.println("Speed: "+ speed);
		System.out.println("Year: "+ year);
	}
	
	boolean isFast(){
		return speed>150;
	}

}
