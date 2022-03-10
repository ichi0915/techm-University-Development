public abstract class Vehicle{
    protected int speed = 0;
    protected float gas = 0;
    protected float maxGas;
    protected float maxSpeed;
    protected Boolean isOn = false;

    //Concrete methods
    public void turnOn(){
        System.out.println("Vehicle is turning on...");
        if(gas-10<=0)
            System.out.println("Not enough gas to turn on the vehicle");
        else{
            isOn=true;
            gas=gas-10;
        }
        System.out.println("Vehicle speed: "+getSpeed());
    }
    public void turnOff() throws TurnOffOngoing{
        System.out.println("Vehicle is turning off");
        if(speed>0){
            throw new TurnOffOngoing("Shouldn`t turn off while being ongoing");
        }
        isOn=false;

    }
    public int getSpeed() {
        return speed;
    }

    //Abstract methods
    public abstract void refuel(float gasAmount);
    public abstract void accelerate();
    public abstract void brake();
}
