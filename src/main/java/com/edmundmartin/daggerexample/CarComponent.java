package com.edmundmartin.daggerexample;

import com.edmundmartin.daggerexample.VarInjectProgram;
import com.edmundmartin.daggerexample.car.Car;
import com.edmundmartin.daggerexample.dagger.PetrolEngineModule;
import com.edmundmartin.daggerexample.dagger.WheelsModule;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(VarInjectProgram program);
}
