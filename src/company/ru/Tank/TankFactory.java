package company.ru.Tank;

import company.ru.Car.Car;
import company.ru.Factory;

public class TankFactory implements Factory {
    public Tank createTank(String typeOfTank) {
        switch (typeOfTank) {
        case "T34" : return new T34();
        case "Pantera" : return new Pantera();
            default : return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}
