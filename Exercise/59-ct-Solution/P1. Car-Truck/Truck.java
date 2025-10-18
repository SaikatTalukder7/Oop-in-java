package A;

public class Truck extends Car {
    int loadCapacity;

    Truck(String b, int capacity) {
        super(b); // call constructor of Car
        this.loadCapacity = capacity; //Should assign like this
    }
    void loadTruck() {
        System.out.println("Truck loaded with loadCapacity " + loadCapacity);
    }
}
