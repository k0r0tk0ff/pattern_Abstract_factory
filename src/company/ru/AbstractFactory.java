package company.ru;

import company.ru.Car.CarFactory;
import company.ru.Tank.TankFactory;

public class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "CarFactory" : return new CarFactory();
            case "TankFactory" : return new TankFactory();
            default: return null;
        }
    }
}
