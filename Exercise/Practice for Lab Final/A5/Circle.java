package A5;

public class Circle extends Shape{

	double radius;
	Circle(String c, double r){
		super(c);
		radius = r;
	}
	@Override
	double area() {
		double ar = 3.1416*radius*radius;
		System.out.println("Area: "+ar);
		return 0;
	}
	
}
