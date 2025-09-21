package AbstractFactoryPattern;


public class HuaweiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("HuaweiPhone is calling");
    }
}