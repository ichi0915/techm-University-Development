package JavaBasics;

public class car extends vehicle {
    private int acceleration;
    private float gasDecrease;

    public car (int acceleration, float gasDecrease,float maxGas, float maxSpeed){

        this.acceleration = acceleration;
        this.gasDecrease = gasDecrease;
        this.maxGas = maxGas;
        this.maxSpeed = maxSpeed;

    }
    
    @Override
    public void refuel(float gasAmount) throws invalidAction{
        if ((gas+=gasAmount) > maxGas || isOn){
            throw new invalidAction("the gas musn't be over the maxGas limit");
        }
        
       
        gas += gasAmount;
    }

    @Override
    public void accelerate () throws invalidAction{
        if(!isOn){
            throw new invalidAction("you cant accelerate when vehicle its off");
        }

        while((speed+=acceleration)<maxSpeed){
            speed +=acceleration;
            if ((gas -= gasDecrease) >0){
                gas -= gasDecrease;
            }

            if (gas == 0){
                break;
            }
            //break si se deja de pisar el acelerador (event)
        }
}

    @Override
    public void brake()throws invalidAction{
        if(!isOn){
            throw new invalidAction("you cant brake when vehicle its off");
        }

        while(speed > 0){
            speed -= 1;
            //break si se deja de pisar el freno (event)
        }

    }
}

