package Ejercicio3Vehicles;

public class Airplane extends Vehicle{
    private boolean isLanded = true;

    public Airplane(){
        this.maxGas = 100;
        this.maxSpeed = 300;
    }

    public void land() {
        if(speed == 0) {
            this.isLanded = true;
            this.isOn = false;
        }
    }
    
    public boolean isLanded(){
        return isLanded;
    } 

    @Override
    public void refuel(float gasAmount) {
        if(((this.gas + gasAmount) <= this.maxGas) && (this.gas >= 0) && (this.isOn == false)) {
            this.gas = this.gas + gasAmount;
        } 
    }

    @Override
    public void accelerate() {
        if ((isOn == true) && (speed >= 0) && (this.gas > 0)) {
            this.speed = this.speed + 50;
            this.gas = this.gas - 8;
            this.isLanded = false;
        }
    }

    @Override
    public void brake() {
        if(isOn == true && (speed > 0)) {
            this.speed = this.speed - 5;
        }
    }
}
