package com.edmundmartin.daggerexample.car;

import com.edmundmartin.daggerexample.car.Car;

import javax.inject.Inject;

public class Remote {

    private Car car;

    @Inject
    public Remote() {}

    public void setListener(Car car) {
        System.out.println("Registering remote");
        this.car = car;
    }
}
