package A;

public class Car {
    String brand;

    Car(String b) {
        this.brand = b;  //Should assign like this
    }
    void startEngine() {
        System.out.println("Engine started for " + brand);
    }
}
