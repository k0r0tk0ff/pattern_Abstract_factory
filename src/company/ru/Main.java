package company.ru;

import company.ru.Car.Car;
import company.ru.Tank.Tank;

public class Main {

    public static void main(String[] arg) {
        AbstractFactory abstractCarFactory = new AbstractFactory();
        Factory carFactory = abstractCarFactory.createFactory("CarFactory");
        Car audi = carFactory.createCar("Audi");
        Car toyota = carFactory.createCar("Toyota");

        AbstractFactory abstractTankFactory = new AbstractFactory();
        Factory tankFactory = abstractTankFactory.createFactory("TankFactory");
        Tank t34 = tankFactory.createTank("T34");
        Tank pantera = tankFactory.createTank("Pantera");

        audi.drive();
        toyota.drive();
        t34.drive();
        pantera.drive();
    }
}
