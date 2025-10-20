package Method;

public class Car {

    String brand;
    Car(String b){
        this.brand=b; //fixed error by removing == and set = here.
    }
    void startEngine(){
        System.out.println("Engine started for car: "+brand);
    }
}
