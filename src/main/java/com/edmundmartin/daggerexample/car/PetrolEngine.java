package com.edmundmartin.daggerexample.car;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {}

    @Override
    public void start() {
        System.out.println("Using petrol");
    }
}
