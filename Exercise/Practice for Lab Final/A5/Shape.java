package A5;

abstract class Shape {
	String color;
	
	abstract double area();
	
	Shape(String c){
		color = c;
	}
	
	void displayColor() {
		System.out.println("Color: "+color);
	}
}
