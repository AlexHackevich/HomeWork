package Moto;

import Vehicles.Engine;
import Vehicles.Wheels;

public class YamahaTTR250 extends Motocycles{
    public YamahaTTR250(Engine engine, int numberOfSeets, Wheels wheels) {
        super(engine, numberOfSeets, wheels);
    }
    @Override
    public void seets(int seet) {
        if(seet<=getNumberOfSeets()){
            System.out.println("Take Passengers");
        }else{
            System.out.println("No seats!");
        }
    }
}
