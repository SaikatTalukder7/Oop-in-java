package A5;

public class Ractangle extends Shape{
	double length;
	double width;
	Ractangle(String c,double l, double w) {
		super(c);
		length = l;
		width = w;
	}
	@Override
	double area() {
		double ar = length*width;
		System.out.println("Area: "+ ar);
		return 0;
	}
	
}
