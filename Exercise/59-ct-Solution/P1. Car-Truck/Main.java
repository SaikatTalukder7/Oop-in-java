package A;

public class Main {
    public static void main(String[] args) {
    	
        Truck myTruck = new Truck("Toyota", 5000);
        Car anotherTruck = new Truck("Ford", 5000);

        Car myCar = (Car) myTruck;
        Truck badTruck = (Truck) anotherTruck;

        myTruck.loadTruck();
        myCar.startEngine();
        System.out.println("LoadCapacity"); //variable loadCapacity not defined so i made it normal string
    }
}
