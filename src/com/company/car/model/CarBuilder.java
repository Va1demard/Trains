package com.company.car.model;

import com.company.car.service.CarService;
import com.company.car.service.CarServiceImpl;

public class CarBuilder {

    public static Car buildCar() {

        Car car = new Car();
        CarService carService = new CarServiceImpl();

        car.setEngine(new Engine());
        car.setSpareWheel(new Wheel());
        carService.addWheels(car);

        return car;
    }
}
