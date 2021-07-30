package com.edmundmartin.daggerexample.dagger;

import com.edmundmartin.daggerexample.car.Rims;
import com.edmundmartin.daggerexample.car.Tires;
import com.edmundmartin.daggerexample.car.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires providesTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
   static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
