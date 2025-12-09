package A6;

abstract class Appliance {
	String brand;
	boolean isOn;
	
	abstract void operate();
	
	Appliance(String brand){
		this.brand = brand;
		this.isOn = false;
	}
	
	void powerSwitch() {
		
		isOn = !isOn;
		if(isOn){
			System.out.println(brand+" is now ON");
		}
		else {
			System.out.println(brand+" is now OFF");
		}
	}
}