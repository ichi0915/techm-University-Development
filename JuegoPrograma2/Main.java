
public class Main {
    public static void main(String args[]){
        //Weapon sword= new Sword();
        Sword sword=new Sword();
        Gun gun=new Gun();
        Ammo ammo=new Ammo();

        sword.setType("witched");
        sword.setPower(300d);
        sword.setName("Escalibur");
        sword.setAmount(8);
        sword.setAmount(10);

        sword.setHandle("Diamond");
        System.out.println(sword.toString()+"\n\n");


        ammo.setCaliber("Calibre 50");
        ammo.setAmount(100);
        ammo.setName("The powerful");
        ammo.setAmountLimit(400);

        gun.setType("Range");
        gun.setPower(70d);
        gun.setAmmoType(ammo);

        System.out.println(gun.toString());
    }
}
