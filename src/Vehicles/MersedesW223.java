package Vehicles;

public class MersedesW223 extends Vehicle {
private boolean isNavigationSystem;
    public MersedesW223(Engine engine, int numberOfSeets, Wheels wheels) {
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
