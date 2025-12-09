package A6;

public class Refrigerator extends Appliance {

	Refrigerator(String b) {
		super(b);
	}

	@Override
	void operate() {
		if(isOn) {
			System.out.println("Refrigerator is On");
		}
		else {
			System.out.println("Please turn on the Refrigerator");

		}
	}
	
	

}
