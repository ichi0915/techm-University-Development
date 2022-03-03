public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Gun();
        Gun gun = new Gun();
        Sword sword = new Sword();


        System.out.println("\nWEAPON\n"+weapon.toString());
        System.out.println("\nGUN\n"+gun.getAmmo());
        System.out.println("\nSWORD\n"+sword.toString());
    }
}
