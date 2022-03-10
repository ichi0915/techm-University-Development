public class Boat extends Vehicle{
    private Boolean isDocked=true;
    //Constructor
    public Boat(){
        speed=0;
        gas=0;
        isOn=false;
        maxSpeed=500;
        maxGas=120000f;
    }
    ////////////////// Concrete methods ////////////////////
    public void dock(){
        if(speed!=0){
            System.out.println("You can`t dock, you are stil on going");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        System.out.println("Docking...\nThe docking has been completed!");
        try {
            this.turnOff();
        } catch (TurnOffOngoing e) {
            System.out.println(e);
        }
        this.isDocked=true;
        System.out.println("Actual speed: "+this.getSpeed());
    }

    ///////////////// implemented methods /////////////////////////
    public void refuel(float gasAmount){
        if(isOn){
            System.out.println("The vehicle is ON, you can`t refuel right now...");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        gasAmount=gas+gasAmount;
        if(gasAmount>maxGas){
            System.out.println("Refueling gas amount passes the max gas capacity of the vehicle by "+ (gasAmount-maxGas) +". Operation NOT completed...");
        }else{
            gas=gasAmount;
            System.out.println("Vehicle refueled. Current gas amount: "+gas+". Operation completed...");
        }
        System.out.println("Actual speed: "+this.getSpeed());
    }

    public void accelerate(){
        if(!isOn){
            System.out.println("You can`t accelerate. The vehicle is off...");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        float gasAux= gas-100;
        if(gasAux<0){
            System.out.println("Not enough gas to accelerate!");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        gas=gasAux;
        this.isDocked=false;
        speed=speed+30;
        if(speed>maxSpeed){
            System.out.println("Max speed reached!");
            speed=(int)maxSpeed;
        }
        System.out.println("Accelerating... Actual speed: "+getSpeed()+"\nGas left: "+gas+"\nAcceleration completed...");
    }
    
    public void brake(){
        if(!isOn){
            System.out.println("You can`t brake. The vehicle is off...");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        speed=speed-150;
        System.out.println("Vehicle is slowing down...");
        if(speed<0){
            speed=0;
        }
        System.out.println("Actual speed: "+this.getSpeed());
    }
}
