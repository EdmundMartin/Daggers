package com.edmundmartin.daggerexample.dagger;

import com.edmundmartin.daggerexample.car.Engine;
import com.edmundmartin.daggerexample.car.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
