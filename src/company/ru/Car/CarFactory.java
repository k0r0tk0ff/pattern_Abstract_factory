package company.ru.Car;

import company.ru.Factory;
import company.ru.Tank.Tank;

public class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Audi" : return new Audi();
            case "Toyota" : return new Toyota();
            default : return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}
