package Verkehrsmitteln;

public class Boat extends Vehicle{
    private boolean isDocked = true;

    public Boat(){
        maxGas = 300;
        maxSpeed = 250;
    }

    public void dock(){
        try{
            isDocked = (getSpeed() > 0) ? false : true;
            System.out.println("Docked.");
            turnOff();
            System.out.println("Boat off.");
        }catch(Exception e){
            System.out.println("Speed must be over 0. Stop for docking.");
        }
    }

    @Override
    public void turnOn() {
        if(isOn == false){
            isOn = true;
            gas = (float) (gas - 0.03);
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
            System.out.println("Turn out the boat for refueling");
        }
    }

    public void accelerate(){
        if(isOn == true) {
            setGas((float) (gas - (getSpeed() * 0.03)));
            if(gas <= 0){
                gas = 0;
                turnOff();
                System.out.println("Ran out of gas.");
            }
        }else{
            System.out.println("Cannot accelerate when the boat is off.");
        }
    }

    public void brake(){
        if(isOn == true){
            setSpeed(0);
        }else{
            System.out.println("Cannot brake when the boat is off.");
        }
    }
}
