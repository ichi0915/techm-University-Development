import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean optionsOn = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease choose a vehicle: Airplane(A), Boat(B) or Car(C). " +
                "If you don't want to drive, press (X) ");
        String userChoice = sc.nextLine().toUpperCase();
        System.out.println("\n MENU: " +
                "\n Accelerate > press (A)" +
                "\n Refuel > press (R)" +
                "\n Brake > press (B)" +
                "\n Dock (Boats only) > press (D)" +
                "\n Land (Airplanes only) > press (L)" +
                "\n Stop driving / Quit > press (X)\n");


        switch (userChoice) {
            //-------------------------
            case "A" -> {
                Airplane vehicle = new Airplane();
                vehicle.setVehicleType("Airplane");

                while (optionsOn) {
                    String userChoice2 = sc.nextLine().toUpperCase();
                    switch (userChoice2) {
                        case "A" -> vehicle.accelerate();
                        case "B" -> vehicle.brake();
                        case "L" -> vehicle.land();
                        case "R" -> {
                            System.out.println("How much? (liters)");
                            Float fuel = sc.nextFloat();
                            vehicle.refuel(fuel);
                        }
                        case "X" -> {
                            System.out.println("Thanks for driving! See you next time");
                            optionsOn = false;
                        }
                        default -> System.out.println("| You can pick another option. If you want to quit, press (X) |");
                    }
                }

                System.out.println(vehicle);
            }

            case "B" -> {
                Boat vehicle = new Boat();
                vehicle.setVehicleType("Boat");

                while (optionsOn) {
                    String userChoice2 = sc.nextLine().toUpperCase();
                    switch (userChoice2) {
                        case "A" -> vehicle.accelerate();
                        case "B" -> vehicle.brake();
                        case "R" -> {
                            System.out.println("How much? (liters)");
                            Float fuel = sc.nextFloat();
                            vehicle.refuel(fuel);
                        }
                        case "X" -> {
                            System.out.println("Thanks for driving! See you next time");
                            optionsOn = false;
                        }
                        default -> System.out.println("| You can pick another option. If you want to quit, press (X) |");
                    }
                }

                System.out.println(vehicle);
            }


            case "C"-> {
                Car vehicle = new Car();

                while (optionsOn) {
                    String userChoice2 = sc.nextLine().toUpperCase();
                    switch (userChoice2) {
                        case "A" -> vehicle.accelerate();
                        case "B" -> vehicle.brake();
                        case "R" -> {
                            System.out.println("How much? (liters)");
                            Float fuel = sc.nextFloat();
                            vehicle.refuel(fuel);
                        }
                        case "X" -> {
                            System.out.println("Thanks for driving! See you next time");
                            optionsOn = false;
                        }
                        default -> System.out.println("| You can pick another option. If you want to quit, press (X) |");
                    }
                }
                System.out.println(vehicle);
            }


            default -> System.out.println("That vehicle is not available. Try again");

        }
    }
}