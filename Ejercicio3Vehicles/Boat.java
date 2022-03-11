package Ejercicio3Vehicles;

public class Boat extends Vehicle {
    private Boolean isDocked = true;

    public Boat(){
        this.maxGas = 60;
        this.maxSpeed = 90;
    }

    public void dock(){
        if(speed == 0) {
            this.isDocked = true;
        }
    }

    public boolean isDocked(){
        return isDocked;
    }

    @Override
    public void refuel(float gasAmount) {
        if(((this.gas + gasAmount) <= this.maxGas) && (this.gas >= 0) && (this.isOn == false)) {
            this.gas = this.gas + gasAmount;
        }  
    }

    @Override
    public void accelerate() {
        if (isOn == true && (speed >= 0) && (this.gas > 0) ) {
            this.speed = this.speed + 15;
            this.gas = this.gas - 4;
            this.isDocked = false;
        }
    }

    @Override
    public void brake() {
        if(isOn == true && (speed > 0)) {
            this.speed = this.speed - 5;
        }
    }
    
}
