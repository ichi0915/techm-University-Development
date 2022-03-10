package Ejercicio2;

public class Gun extends Weapon{
    public Ammo ammoType;

    public Gun(String name, int amount, int amountLimit, String type, double power) {
        this.name = name;
        this.amount = amount;
        this.amountLimit = amountLimit;
        this.type = type;
        this.power = power;
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
