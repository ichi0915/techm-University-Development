public class Airplane extends Vehicle{
    private Boolean isLanded=true;

    //Constructor
    public Airplane(){
        speed=0;
        gas=0;
        isOn=false;
        maxSpeed=2000;
        maxGas=320000f;
    }
    /////////////////// concrete methods ///////////////////////////////
    public void land(){
        if(speed!=0){
            System.out.println("You can`t land, you are stil on going");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        System.out.println("Landing...\nThe landing has been completed!");
        try {
            this.turnOff();
        } catch (TurnOffOngoing e) {
            System.out.println(e);
        }
        
        this.isLanded=true;
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
        float gasAux= gas-2400;
        if(gasAux<0){
            System.out.println("Not enough gas to accelerate!");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        gas=gasAux;
        this.isLanded=false;
        speed=speed+200;
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
