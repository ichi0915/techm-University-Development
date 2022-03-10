package Verkehrsmitteln;

public class Main {
    public static void main (String []args){
        Airplane a = new Airplane();
        Boat b = new Boat();
        Car c = new Car();

        a.turnOn();
        a.accelerate();
        a.brake();
        a.accelerate();
        a.land();
        //a.turnOff();
        a.refuel(200);

        b.turnOn();
        b.accelerate();
        b.brake();
        b.accelerate();
        b.dock();
        //b.turnOff();
        b.refuel(100);

         c.turnOn();
         c.accelerate();
         c.brake();
         c.turnOff();
         c.refuel(50);
    }
}
