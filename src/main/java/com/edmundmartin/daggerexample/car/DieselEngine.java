package com.edmundmartin.daggerexample.car;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        System.out.println("Using diesel");
    }
}
