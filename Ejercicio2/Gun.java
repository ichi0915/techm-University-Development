package Ejercicio2;

public class Gun extends Weapon{
    Ammo ammoType = new Ammo("5mm");

    public Gun(String name, int amount, int amountLimit, String type, double power) {
        super(name, amount, amountLimit, type, power);
    }

    void setAmmo(Ammo ammoType) {
        this.ammoType = ammoType; 
    }

    Ammo getAmmo() {
        return ammoType;
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    @Override
    String getType() {
        return type;
    }
}
