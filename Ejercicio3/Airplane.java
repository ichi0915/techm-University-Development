package Ejercicio3;

public class Airplane extends Vehicle{
    private boolean isLanded=true;

    public boolean isLanded() {
        return isLanded;
    }

    public void setLanded(boolean landed) {
        isLanded = landed;
    }

    public void land(){
    }
    //should implement
    @Override
    public void refuel(float gasAmount) {
        gas+=gasAmount;
    }

    @Override
    public void accelerate() {
        speed+=5;
    }

    @Override
    public void brake() {
        speed-=5;
    }
    //not necessary
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
