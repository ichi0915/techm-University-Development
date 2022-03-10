package Ejercicio3;

public class Car extends Vehicle{
    //Must implement
    @Override
    public void refuel(float gasAmount) {
        gas+=gasAmount;
    }

    @Override
    public void accelerate() {
        speed+=2;
    }

    @Override
    public void brake() {
        speed-=2;
    }
    //Not necessary
    @Override
    public void turnOn() {
        isOn=true;
    }

    @Override
    public void turnOff() {
        isOn=false;
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }
}
