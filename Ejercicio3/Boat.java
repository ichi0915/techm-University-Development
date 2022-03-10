package Ejercicio3;

public class Boat extends Vehicle{
    private boolean isDocked=true;

    public boolean isDocked() {
        return isDocked;
    }

    public void setDocked(boolean docked) {
        isDocked = docked;
    }

    public void dock(){

    }
    //Must implement
    @Override
    public void refuel(float gasAmount) {
        gas+=gasAmount;
    }

    @Override
    public void accelerate() {
        speed+=4;
    }

    @Override
    public void brake() {
        speed-=4;
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
