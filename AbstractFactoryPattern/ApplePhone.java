package AbstractFactoryPattern;


public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("ApplePhone is calling");
    }
}

