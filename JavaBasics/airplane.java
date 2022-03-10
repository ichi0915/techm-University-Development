package JavaBasics;

public class airplane extends vehicle{
    private boolean isLanded = true;
    private int acceleration;
    private float gasDecrease;

    public airplane (int acceleration, float gasDecrease,float maxGas, float maxSpeed){

        this.acceleration = acceleration;
        this.gasDecrease = gasDecrease;
        this.maxGas = maxGas;
        this.maxSpeed = maxSpeed;

    }

    public void land()throws invalidAction{
        if(speed != 0){
            throw new invalidAction("you must stop to be landed");
        }
        isLanded = true;
    }

    @Override
    public void turnOff() throws invalidAction {
        if(!isLanded){
            throw new invalidAction("you must land to turn off the airplane");
        }
        isOn = false;
    }

    @Override
    public void refuel(float gasAmount) throws invalidAction{
        if ((gas+=gasAmount) > maxGas || isOn){
            throw new invalidAction("the gas musn't be over the maxGas limit or have to turn off");
        }
        
       
        gas += gasAmount;
    }

    @Override
    public void accelerate () throws invalidAction{
        if(!isOn){
            throw new invalidAction("you cant accelerate when vehicle its off");
        }

        isLanded = false;
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
