package FactoryPattern;

public class Main {
    public static void main(String[] args) {

        PhoneFactory huaweiPhoneFactory = new HuaweiFactory();
        Phone huaweiPhone = huaweiPhoneFactory.createPhone();
        huaweiPhone.call();

        PhoneFactory applePhoneFactory = new AppleFactory();
        Phone applePhone = applePhoneFactory.createPhone();
        applePhone.call();

    }
}