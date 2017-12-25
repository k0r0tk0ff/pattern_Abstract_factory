package company.ru;

public class Main {

    public static void main(String[] arg) {
        AbstractFactory abstractFactory = new AbstractFactory();
        Factory factory = abstractFactory.createFactory("CarFactory");
        factory.createCar("Audi").drive();
    }
}
