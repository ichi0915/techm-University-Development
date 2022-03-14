package Ejercicio_3;

public class Car extends Vehicle{
    private float maxCarGas = 100;
    private float maxCarSpeed = 200;
    public Car(float initialGas) {
        fill(Math.min(initialGas, maxCarGas));
        setMaxGas(maxCarGas);
        //Decrease gas-out factor 1l/km traveled, put how many litres you want to decrease by km traveled
        setGasOutFactor(1);
        setMaxSpeed(maxCarSpeed);
    }
    public void acceleration(int seconds) {
        if(!isOn) return; //Can not accelerate if vehicle is turned off
        for (int i = 0; i < seconds; i++) {
            accelerate(5);
            if (getSpeed() >= maxCarSpeed) {
                //System.out.println("Cannot accelerate more, traveling 1 sec instead");
                travel(1);
            }
        }
    }
}
