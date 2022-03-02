package Ejercicio2;

public class Gun extends Weapon{
    public Ammo ammoType;

    public Ammo getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(Ammo ammoType) {
        this.ammoType = ammoType;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double getPower() {
        return power;
    }

    @Override
    public void setPower(Double power) {
        this.power=power;
    }
}
