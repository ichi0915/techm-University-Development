package Ejercicio3;

public abstract class Vehicle {
    protected Integer speed=0;
    protected float gas=0;
    protected float maxGas;
    protected float maxSpeed;
    protected boolean isOn=false;

    abstract public void turnOn();
    abstract public void turnOff();
    abstract public Integer getSpeed();
    abstract public void refuel(float gasAmount);
    abstract public void accelerate();
    abstract public void brake();
}
