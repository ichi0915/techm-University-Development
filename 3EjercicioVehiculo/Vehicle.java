public abstract class Vehicle {
    protected int speed;
    protected float gas;
    protected float maxGas;
    protected float maxSpeed;
    protected Boolean isOn = false;
    protected String vehicleType;

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public Integer getSpeed(){
        return this.speed;
    }

    public void refuel(float gasAmount){
        this.gas += gasAmount;
    }

    public void accelerate(){
        this.speed+=10;
    }

    public void brake(){
        this.speed = 0;
    }

    public String toString(){
        return  "\n------Vehicle Status--------\n Type: "+this.vehicleType+
                "\n Gas: "+this.gas+" liters"+
                "\n Reached speed: "+this.speed+" km/h"+
                "\n----------------------------";
    }


}
