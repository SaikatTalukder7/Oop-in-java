package Method;

public class Main {
    public static void main(String[] args) {
        Car c =new Car("SKT");
        Truck t = new Truck("Volvo", 5000);
        t.loadTruck();
        c.startEngine();
    }
}
