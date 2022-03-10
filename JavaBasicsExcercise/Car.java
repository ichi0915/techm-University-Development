public class Car extends Vehicle{
    //Constructor
    public Car(){
        speed=0;
        gas=0;
        isOn=false;
        maxSpeed=250;
        maxGas=100f;
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
        float gasAux= gas-2;
        if(gasAux<0){
            System.out.println("Not enough gas to accelerate!");
            System.out.println("Actual speed: "+this.getSpeed());
            return;
        }
        gas=gasAux;
        speed=speed+10;
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
