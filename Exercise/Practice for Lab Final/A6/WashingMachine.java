package A6;

public class WashingMachine extends Appliance{

	
	WashingMachine(String b) {
		super(b);
	}

	@Override
	void operate() {
		if(isOn){
			System.out.println("Washing Clothes");
		}
		else {
			System.out.println("Please turn on the machine first");
		}
		
	}

}
