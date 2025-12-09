package A7;

public class Car {
	
	String modelName;
	int year;
	double price;
	
	public String getModelName() {
		return modelName;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public void setYear(int year) {

			int current_year = java.time.Year.now().getValue();
			
			if(year>current_year) {
				
				System.out.println("Year can't be future!");
				this.year = current_year;

			}
			
			else {
				this.year = year;
			}
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	void showDetails() {
		
		System.out.println("Model Name: "+ modelName);

		System.out.println("Year: "+year);

		System.out.println("Price: "+price);

	}
	
	

}
