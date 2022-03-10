package Verkehrsmitteln;

public abstract class Vehicle {
    protected int speed = 0;
    protected float gas = 0;
    protected float maxGas;
    protected float maxSpeed;
    protected boolean isOn = false;

    public void turnOn(){}

    public void turnOff(){}

    public void setSpeed(int speed){
        if(speed > 0 & speed <= maxSpeed){
            this.speed = speed;
        }else{
            System.out.println("Speed must be over 0.");
        }
    }

    public int getSpeed(){ return this.speed; }

    public abstract void refuel(float gasAmount);

    public void setGas(float gas){
        if(gas > 0 & gas <= maxGas){
            this.gas = gas;
        }else{
            System.out.println("Gas must be over 0.");
        }
    }

    public abstract void accelerate();

    public abstract void brake();
}
