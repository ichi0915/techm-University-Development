package Verkehrsmitteln;

public class Car extends Vehicle{

    public Car(){
        maxGas = 100;
        maxSpeed = 200;
    }

    @Override
    public void turnOn() {
        if(isOn == false){
            isOn = true;
            gas = (float) (gas - 0.02);
        }
    }

    @Override
    public void turnOff() {
        if(getSpeed() == 0){
            isOn = false;
            System.out.println("OFF.");
        }else{
            System.out.println("Must be on 0 speed.");
        }
    }

    public void refuel(float gasAmount){
        if(isOn == false) {
            setGas(gasAmount+gas > maxGas ? maxGas : gasAmount+gas);
        }else{
            System.out.println("Turn out the car for refueling");
        }
    }

    public void accelerate(){
        if(isOn == true) {
            setGas((float) (gas - (getSpeed() * 0.02)));
            if(gas <= 0){
                gas = 0;
                turnOff();
                System.out.println("Ran out of gas.");
            }
        }else{
            System.out.println("Cannot accelerate when the car is off.");
        }
    }

    public void brake(){
        if(isOn == true){
            setSpeed(0);
        }else{
            System.out.println("Cannot brake when the car is off.");
        }
    }
}
