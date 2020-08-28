package com.company.car.service;

import com.company.car.model.Car;
import com.company.car.model.Wheel;
import com.company.car.view.AppUi;

public class CarServiceImpl implements CarService {

    public void addWheels(Car car) {

        for (int i = 0; i < 4; i++) {
            car.getWheels().add(new Wheel());
        }
    }


    public void changeWheel(Car car, int numOfWheel) {

//        int numOfWheel = AppUi.enterWhatWheelChange();
        switch (numOfWheel) {
            case 1:
                car.getWheels().set(0, car.getSpareWheel());
                break;
            case 2:
                car.getWheels().set(1, car.getSpareWheel());
                break;
            case 3:
                car.getWheels().set(2, car.getSpareWheel());
                break;
            case 4:
                car.getWheels().set(3, car.getSpareWheel());
                break;
        }
        System.out.println("Колесо номер " + numOfWheel + " заменено на запасное");
    }

    public String isCarReadyToDrive(Car car) {

        if (!car.getEngine().isPower()) {
            return "Не заведён";
        }

        if (!car.getEngine().isFuel()) {
            return "Нет топлива";
        }

        return "";
    }

    public void ride(Car car) {

        String carReadyToDrive = isCarReadyToDrive(car);
        if (!carReadyToDrive.isEmpty()) {
            System.out.println(carReadyToDrive);
        } else {
            System.out.println("Машина едет");
            car.getEngine().setFuel(false);
        }
    }
}
