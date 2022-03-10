package Ejercicio3Vehicles;

public class Main {
    public static void main(String[] args) {
        Airplane v1 = new Airplane();
        Car v2 = new Car();
        Boat v3 = new Boat();
        
        
        v1.refuel(100);
        v2.refuel(40);
        v3.refuel(60);

        v1.turnOn();
        v2.turnOn();
        v3.turnOn();

        v1.accelerate();
        v2.accelerate();
        v3.accelerate();

        v1.brake();
        v2.brake();
        v3.brake();
        v3.brake();
        v3.brake();
        
        v1.turnOff();
        v3.turnOff();

        v1.land();
        v3.dock();

        System.out.println("Gas: " + v1.gas + ", Is on: " + v1.isOn + ", Speed: " + v1.speed + ", max gas: " + v1.maxGas + ", max speed: " + v1.maxSpeed + " landend: " + v1.isLanded());
        System.out.println("Gas: " + v2.gas + ", Is on: " + v2.isOn + ", Speed: " + v2.speed + ", max gas: " + v2.maxGas + ", max speed: " + v2.maxSpeed);
        System.out.println("Gas: " + v3.gas + ", Is on: " + v3.isOn + ", Speed: " + v3.speed + ", max gas: " + v3.maxGas + ", max speed: " + v3.maxSpeed + ", Docked: " + v3.isDocked());
    }
}
