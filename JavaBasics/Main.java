package JavaBasics;

public class Main {
    
    public static void main(String[] args) {
        airplane fx = new airplane(2, 1, 10, 20);
        boat yate = new boat(1, 2, 20, 10);
        car lambo = new car(3, 4, 30, 40);
        try{
        
        lambo.turnOn();
        lambo.accelerate();
        lambo.brake();
        lambo.turnOff();
        lambo.refuel(10);

        fx.turnOn();
        fx.accelerate();
        fx.land();
        /*
        you have tu turn off the car to refuel
        fx.turnOn();
        fx.refuel(1);
        yate.turnOn();
        yate.refuel(1);
        lambo.turnOn();
        lambo.refuel(1);
        /*
        the gas musn't be over the limit
        fx.refuel(100);
        yate.refuel(100);
        lambo.refuel(100);
        /*
        cant acelerate when vehicle its off
        fx.accelerate();
        yate.accelerate();
        lambo.accelerate();
        */
        }
        catch(invalidAction e){
            System.out.println(e);
        }

    }
}
