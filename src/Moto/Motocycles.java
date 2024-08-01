package Moto;

import Vehicles.Engine;
import Vehicles.Vehicle;
import Vehicles.Wheels;

public abstract class Motocycles extends Vehicle {
    public Motocycles(Engine engine, int numberOfSeets, Wheels wheels) {
        super(engine, numberOfSeets, wheels);
    }
}
