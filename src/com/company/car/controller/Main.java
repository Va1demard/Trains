package com.company.car.controller;

import com.company.car.model.Car;
import com.company.car.model.CarBuilder;
import com.company.car.service.CarService;
import com.company.car.service.CarServiceImpl;
import com.company.car.view.AppUi;

import java.util.Scanner;

public class Main {

    //todo сделать котроллер в мейн
    public static void main(String[] args) {

        CarService carService = new CarServiceImpl();
        int choice;
        boolean isEndOfProgram = false;
        int wheelToChange;
        Car car = CarBuilder.buildCar();

        for (; ; ) {
            System.out.println("Выбирете действие:\n" +
                    "1. Заправить двигатель\n" +
                    "2. Включить зажигание\n" +
                    "3. Выключить зажигание\n" +
                    "4. Заменить колесо\n" +
                    "5. Ехать\n" +
                    "6. Выход из программы");
            Scanner num = new Scanner(System.in);
            choice = num.nextInt();
            switch (choice) {

                case 1:
                    car.getEngine().refuel();
                    break;
                case 2:
                    car.getEngine().onEngine();
                    break;
                case 3:
                    car.getEngine().offEngine();
                    break;
                case 4:
                    wheelToChange = AppUi.enterWhatWheelChange();
                    carService.changeWheel(car, wheelToChange);
                    break;
                case 5:
                    carService.ride(car);
                    break;
                case 6:
                    isEndOfProgram = true;
                    break;


            }
            if (isEndOfProgram) {
                break;
            }
        }
    }
}
