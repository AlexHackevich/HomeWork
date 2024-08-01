package Vehicles;

import Interfaces.Transportable;

public abstract class Vehicle implements Transportable {
    private Engine engine;
    private Wheels wheels;
    private int numberOfSeets;
    private int[] carLock;

    public Vehicle(Engine engine, int numberOfSeets, Wheels wheels) {
        this.engine = engine;
        this.numberOfSeets = numberOfSeets;
        this.wheels = wheels;
    }
    public int getNumberOfSeets() {
        return numberOfSeets;
    }
}
