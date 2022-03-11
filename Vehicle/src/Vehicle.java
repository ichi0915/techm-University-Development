abstract class Vehicle {
    protected int speed = 10;
    protected float gas = 150;
    protected float maxGas = 1000;
    protected  float maxSpeed = 800;
    protected boolean isOn = false;

    public void turnOn (){};
    public void turnOff (){};

    public int getSpeed() {
        return speed;
    }
    public void refuel(float gasAmound){}

    public void acelerate (){}
    public void brake(){}

    public abstract void getTurnOff();

    public abstract boolean setTurnOn();
    public abstract void getTurnOn();
}



 class check{
    public static void main(String[] args){
        airplane Airplane = new airplane() {
            @Override public int getSpeed() {
                System.out.println(speed);
                return super.getSpeed();
            }
        };
    }
 }