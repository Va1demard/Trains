package com.company.car.model;

public class Engine {

    private boolean fuel = false;
    private boolean power = false;


    public void onEngine(){
        this.power = true;
        System.out.println("Двигатель включен");
    }

    public void offEngine(){
        this.power = false;
        System.out.println("Двигатель выключен");
    }

    public void refuel(){
        this.fuel = true;
        System.out.println("Топливо заправлено");
    }

    public boolean isFuel() {
        return fuel;
    }

    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
