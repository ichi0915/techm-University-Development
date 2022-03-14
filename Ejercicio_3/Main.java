package Ejercicio_3;

public class Main {

    public static void main(String[] args) {
        scenario1();
    }
    private static void scenario1() {
        Car myCar = new Car(150); //Setting with bigger than the max gas to set it just to the maximum
        myCar.turnOn();
        myCar.acceleration(55);
        myCar.travel(20);
        myCar.brake();
        System.out.println(myCar.getInfo());
        Airplane myAirplane = new Airplane(2000);
        myAirplane.turnOn();
        myAirplane.takeOffAirplane();//Speed here is 150 or bit more
        myAirplane.acceleration(20);
        myAirplane.travel(3600);
        System.out.println(myAirplane.getInfo());
        Boat myBoat = new Boat(2000);
        myBoat.turnOn();
        myBoat.unDock();
        myBoat.acceleration(50);
        myBoat.travel(4000);
        System.out.println(myBoat.getInfo());
    }
}
