package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Gun machineGun = new Gun("Uzi", 200, 400);
        System.out.println(machineGun.getName() +"\n"+  machineGun.getAmount());
        Ammo myammo = new Ammo();
        myammo.setCaliber("my");
        System.out.println(myammo.getCaliber());
    }
}
