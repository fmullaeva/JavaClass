package Inheritance.landVehicle;

public class Bus extends Vehicle {

 @Override
    void drive() {
        System.out.println("Bus is driving");
    }
@Override
    public void stop() {
        System.out.println("Bus is stopping");

    }
 @Override
    protected Double accelerate() {
        System.out.println("Bus is accelerating");
        return 50.9;
    }
}