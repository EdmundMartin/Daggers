package com.edmundmartin.daggerexample;

import com.edmundmartin.daggerexample.car.Car;
import com.edmundmartin.daggerexample.dagger.DieselEngineModule;

public class Main {

    public static void main(String[] args) {

        // Component
        CarComponent component = DaggerCarComponent.create();
        Car car = component.getCar();
        car.drive();

        // Module with constructor
        DieselCarComponent dieselCarComponent = DaggerDieselCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

        Car dieselCar = dieselCarComponent.getCar();
        dieselCar.drive();

        // Field Injection
        VarInjectProgram program = new VarInjectProgram();
        program.run();
    }
}
