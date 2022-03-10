package Ejercicio3Vehicles;

public abstract class Vehicle {
    protected int speed = 0;
    protected float gas = 0;
    protected float maxGas;
    protected float maxSpeed;
    protected boolean isOn = false;

    public void turnOn(){
        if(this.isOn == false && this.gas > 0) {
            this.isOn = true;
            this.gas = this.gas - 2;
        } 
    }

    public void turnOff(){
        if(speed == 0) {
            this.isOn = false;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public abstract void refuel(float gasAmount);

    public abstract void accelerate();
    public abstract void brake();
}

