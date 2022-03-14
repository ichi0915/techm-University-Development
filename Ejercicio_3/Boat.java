package Ejercicio_3;

public class Boat extends Vehicle{
    private boolean isDocked = true;
    float maxBoatGas = 400;
    float maxBoatSpeed = 100;
    public Boat(float initialGas) {
        fill(Math.min(initialGas, maxBoatGas));
        setMaxGas(maxBoatGas);
        //Decrease gas-out factor 1l/km traveled, put how many litres you want to decrease by km traveled
        setGasOutFactor(1);
        setMaxSpeed(maxBoatSpeed);
    }
    public void acceleration(int seconds) {
        if(!isOn || isDocked) return; //Can not accelerate if boat is turned off or is docked
        for (int i = 0; i < seconds; i++) {
            accelerate(15);
            if (getSpeed() >= maxBoatSpeed) {
                //System.out.println("Cannot accelerate more, traveling 1 sec instead");
                travel(1);
            }
        }
    }
    public void unDock() {
        isDocked = false;
    }
}
