package Interfaces;

public interface Refueable {
    public default void refuel(){
        System.out.println("I refuel the vehicle");
    };
}
