package Ejercicio3Vehicles;

public class Car extends Vehicle{

    public Car(){
        this.maxGas = 40;
        this.maxSpeed = 120;
    }

    @Override
    public void refuel(float gasAmount) {
        if(((this.gas + gasAmount) <= this.maxGas) && (this.gas >= 0) && (this.isOn == false)) {
            this.gas = this.gas + gasAmount;
        } 
    }

    @Override
    public void accelerate() {
        if (isOn == true && (speed >= 0) && (this.gas > 0)) {
            this.speed = this.speed + 20;
            this.gas = this.gas - 6;
        }
    }

    @Override
    public void brake() {
        if(isOn == true && (speed > 0)) {
            this.speed = this.speed - 5;
        }
    }
    
}
