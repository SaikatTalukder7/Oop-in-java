package A6;

public class Main {

	public static void main(String[] args) {

		WashingMachine w1 = new WashingMachine("Hello");
		
		w1.powerSwitch();
		w1.operate();
		
		Refrigerator r1 = new Refrigerator("Walton");
		
		r1.powerSwitch();
		r1.operate();

	}

}
