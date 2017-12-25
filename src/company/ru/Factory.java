package company.ru;

import company.ru.Car.Car;
import company.ru.Tank.Tank;

public interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}
