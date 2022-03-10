package JavaBasics;

abstract class vehicle{
    protected int speed = 0;
    protected float gas = 0;
    protected float maxGas;
    protected float maxSpeed;
    protected boolean isOn = false;

    public void turnOn(){
        gas -= 1;
        isOn = true;
    }
    public void turnOff() throws invalidAction{
        if(speed != 0){
            throw new invalidAction("you must stop to turn off");
        }
        isOn = false;
    }

    public int getSpeed(){
        return speed;
    }
    public abstract void refuel(float gasAmount) throws invalidAction ;
    public abstract void accelerate() throws invalidAction;
    public abstract void brake() throws invalidAction;
}
