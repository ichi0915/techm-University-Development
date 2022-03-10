package Verkehrsmitteln;

public class Airplane extends Vehicle{
    private boolean isLanded = true;

    public Airplane(){
        maxGas = 500;
        maxSpeed = 1500;
    }

    public void land(){
        try{
            isLanded = (getSpeed() > 0) ? false : true;
            System.out.println("Landed.");
            turnOff();
            System.out.println("Airplane off.");
        }catch(Exception e){
            System.out.println("Speed must be over 0. Stop for landing.");
        }
    }

    @Override
    public void turnOn() {
        if(isOn == false){
            isOn = true;
            gas = (float) (gas - 0.04);
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
            System.out.println("Turn out the airplane for refueling");
        }
    }

    public void accelerate(){
        if(isOn == true) {
            setGas((float) (gas - (getSpeed() * 0.04)));
            if(gas <= 0){
                gas = 0;
                turnOff();
                System.out.println("Ran out of gas.");
            }
        }else{
            System.out.println("Cannot accelerate when the airplane is off.");
        }
    }

    public void brake(){
        if(isOn == true){
            setSpeed(0);
        }else{
            System.out.println("Cannot brake when the airplane is off.");
        }
    }
}
