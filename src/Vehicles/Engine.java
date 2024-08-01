package Vehicles;

public class Engine {
    private float volume;
    private FuelType fuelType;
    private String nameEngine;

    public Engine(FuelType fuelType, String nameEngine, float volume) {
        this.fuelType = fuelType;
        this.nameEngine = nameEngine;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType=" + fuelType +
                ", volume=" + volume +
                ", nameEngine='" + nameEngine + '\'' +
                '}';
    }
}
