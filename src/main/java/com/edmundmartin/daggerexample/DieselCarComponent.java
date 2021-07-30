package com.edmundmartin.daggerexample;

import com.edmundmartin.daggerexample.car.Car;
import com.edmundmartin.daggerexample.dagger.DieselEngineModule;
import com.edmundmartin.daggerexample.dagger.WheelsModule;
import dagger.Component;

@Component(modules={WheelsModule.class, DieselEngineModule.class})
public interface DieselCarComponent {

    Car getCar();
}
