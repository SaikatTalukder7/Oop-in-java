package Constructor;

public class SmartPhone extends Phone {
    int storage;
    SmartPhone(String m, int s){
        super(m);
        this.storage=s;
    }
    void installApp(){
        System.out.println("Installing app with " + storage +"GB storage");
    }
}
