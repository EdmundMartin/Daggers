package com.edmundmartin.daggerexample;

import com.edmundmartin.daggerexample.car.Car;

import javax.inject.Inject;

public class VarInjectProgram {

    @Inject
    Car car;

    public void run() {
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();
    }
}
