package com.edmundmartin.daggerexample.car;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // Method injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        System.out.println("driving");
    }
}
