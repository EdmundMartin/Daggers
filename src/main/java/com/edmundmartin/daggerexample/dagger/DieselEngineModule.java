package com.edmundmartin.daggerexample.dagger;

import com.edmundmartin.daggerexample.car.DieselEngine;
import com.edmundmartin.daggerexample.car.Engine;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    Engine bindEngine() {
        return new DieselEngine(horsepower);
    }
}
