package FactoryPattern;

public class AppleFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}