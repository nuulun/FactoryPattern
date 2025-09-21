package AbstractFactoryPattern;


public class Main {
    public static void main(String[] args) {

        TechFactory huaweiFactory = new HuaweiFactory();
        Phone huaweiPhone = huaweiFactory.createPhone();
        Laptop huaweiLaptop = huaweiFactory.createLaptop();
        huaweiPhone.call();
        huaweiLaptop.work();

        TechFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Laptop appleLaptop = appleFactory.createLaptop();
        appleLaptop.work();
        applePhone.call();

    }
}