package com.company.car.service;

import com.company.car.model.Car;

public interface CarService {

    void addWheels(Car car);

    void changeWheel(Car car, int numOfWheel);

    String isCarReadyToDrive(Car car);

    void ride(Car car);
}
