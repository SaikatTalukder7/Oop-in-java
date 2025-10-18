package B;

public class CarApp {

	public static void main(String[] args) {

		Vehicle v = new Car("Toyota",150); //As we define int in the Car so can't use 150.0
		v.showModel(); //Output show from Car

	}

}
