package Ejercicio_3;

public abstract class Vehicle {
    protected int speed = 0;
    protected float gas = 0;
    protected float maxGas = 0;
    protected float maxSpeed = 0;
    protected boolean isOn = false;
    protected double gasOutFactor = 0;
    private double totalDistanceTraveled = 0;

    public void setGasOutFactor (double gasOutFactor) {
        this.gasOutFactor = gasOutFactor;
    }

    public double getTotalDistanceTraveled() {
        return totalDistanceTraveled;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void fill(float gasAmount) {
        gas += gasAmount;
    }

    public void accelerate(int increaseFactor) {
        speed += increaseFactor; //Increasing 5 by 5 km/h
        if(speed > maxSpeed) {
            speed = (int) maxSpeed;
        }else{
            unFill(speed);
        }
    }

    private void unFill(int currentSpeed) {
        final float distance = (float) (currentSpeed / 3.6); //Turned into meters to have actual readable values
        final float gasConsumed = (float) ((distance / 1000) * gasOutFactor );
        gas -= gasConsumed;
        totalDistanceTraveled += distance / 1000;
    }

    public void brake() {
        speed = 0; //Needs an algorithm to decrease 50 by 50
    }
    //Need to set this two new values to set different max speed and max gas according to the vehicle
    public void setMaxGas(float maxGas) {
        this.maxGas = maxGas;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void travel(int seconds) {
        //Used to test purposes
        //double travelDistance = 0;
        for (int i = 0; i < seconds; i++) {
            //travelDistance += speed / 3.6;
            unFill(speed);
        }
    }

    public String getInfo() {
        return "Vehicle{\n" +
                "speed=" + speed + " km/h \n" +
                "gas=" + gas + " Lts\n" +
                "maxGas=" + maxGas + " Lts\n" +
                "maxSpeed=" + maxSpeed + " km/h\n" +
                "isOn=" + isOn + "\n" +
                "Distance traveled: " + getTotalDistanceTraveled() + "km" +
                "\n}";
    }
}
