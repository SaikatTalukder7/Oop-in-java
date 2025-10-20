package Constructor;

public class Phone {
    String model;
    Phone(String m){
        this.model=m;
    }
    void makeCall()
    {
        System.out.println("Calling from "+ model);
    }
}
