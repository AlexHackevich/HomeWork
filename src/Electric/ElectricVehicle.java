package Electric;

import Vehicles.Vehicle;

public abstract class  ElectricVehicle extends Vehicle {
    private int powerReserve;          //запас хода
    private float fullChargeTime;      // время полной зарядки
    private ChargerType chargerType;   // тип зарядки (быстрый/медленный)
}
