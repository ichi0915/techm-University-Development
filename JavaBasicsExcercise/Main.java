public class Main {
    public static void main(String[] args) {
        Airplane avion=new Airplane();
        System.out.println("");
        avion.turnOn();
        avion.refuel(100000);
        avion.turnOn();
        avion.accelerate();
        avion.accelerate();
        avion.land();
        avion.brake();
        avion.brake();
        avion.brake();
        avion.land();
        avion.accelerate();
        

        Car car=new Car();
        car.refuel(11);
        car.turnOn();
        car.accelerate();
        car.refuel(10);

        try {
            car.turnOff();
        } catch (TurnOffOngoing e) {
            System.out.println(e);
        }
        car.brake();

        Boat boat=new Boat();
        boat.refuel(1000);
        boat.turnOn();
        boat.accelerate();
        boat.dock();
        try {
            boat.turnOff();
        } catch (TurnOffOngoing e) {
            System.out.println(e);
        }
    }
}
