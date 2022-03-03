package Ejercicio2;

public class Gun extends Weapon{
    public Ammo ammoType;

    public Ammo getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(Ammo ammoType) {
        this.ammoType = ammoType;
    }

    //Adding the toString method to obtain info about the gun
    @Override
    public String toString(){
        return "Your weapon is: "+name+", type: "+type+", power range: "+power;
    }
}
