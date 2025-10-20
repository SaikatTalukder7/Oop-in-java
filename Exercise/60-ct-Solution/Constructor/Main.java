package Constructor;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone("SKT");
        SmartPhone s = new SmartPhone("Nokia", 64);
        s.installApp();
        p.makeCall();
    }
}
