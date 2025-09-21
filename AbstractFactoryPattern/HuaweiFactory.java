package AbstractFactoryPattern;



public class HuaweiFactory implements TechFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new HuaweiLaptop();
    }
}