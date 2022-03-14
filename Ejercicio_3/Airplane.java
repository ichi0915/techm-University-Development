package Ejercicio_3;

public class Airplane extends  Vehicle{
    private boolean land = true;
    private float maxAirplaneSpeed = 400;
    public Airplane(float initialGas) {
        float maxAirplaneGas = 1000;
        float maxAirplaneSpeed = 400;
        fill(Math.min(initialGas, maxAirplaneGas));
        setMaxGas(maxAirplaneGas);
        //Decrease gas-out factor 1l/km traveled, put how many litres you want to decrease by km traveled
        setGasOutFactor(1);
        setMaxSpeed(maxAirplaneSpeed);
    }
    public void acceleration(int seconds) {
        if(!isOn || land) return; //Can not accelerate if plane is turned off or is in land
        for (int i = 0; i < seconds; i++) {
            accelerate(50);
            if (getSpeed() >= maxAirplaneSpeed) {
                //System.out.println("Cannot accelerate more, traveling 1 sec instead");
                travel(1);
            }
        }
    }
    public void takeOffAirplane() {//This with this function you will set the conditions to accelerate in the plane
        while (land) {
            accelerate(20);
            if(getSpeed() >= 150) { // 150km/h you can take off as a plane
                land = false;
            }
        }
    }
}
