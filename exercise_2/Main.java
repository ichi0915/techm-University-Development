package exercise_2;

public class Main {
  public static void main(String[] args) {

    Ammo ammo = new Ammo("AmmoName", 0, 0, "AmmoCaliber");

    System.out.println(ammo);

    Gun gun = new Gun("GunName", 0, 0, "GunType", 0, ammo);

    System.out.println(gun);

    Sword sword = new Sword("SwordName", 0, 0, "SwordType", 0, "SwordHandle");

    System.out.println(sword);
  }
}