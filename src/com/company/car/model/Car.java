package com.company.car.model;

import java.util.ArrayList;

public class Car {

    private Engine engine;
    private ArrayList<Wheel> wheels;
    private Wheel spareWheel;

    public Car(Engine engine, ArrayList<Wheel> wheels, Wheel spareWheel) {
        this.engine = engine;
        this.wheels = wheels;
        this.spareWheel = spareWheel;
    }

    public Car(){
        this.engine = new Engine();
        this.wheels = new ArrayList<>();
        this.spareWheel = new Wheel();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Wheel getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(Wheel spareWheel) {
        this.spareWheel = spareWheel;
    }
}
