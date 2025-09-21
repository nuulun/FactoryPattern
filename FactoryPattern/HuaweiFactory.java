package FactoryPattern;

public class HuaweiFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}