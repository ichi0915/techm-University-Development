public class Gun extends Weapon{
    public Ammo ammoType;

    public Ammo getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(Ammo ammoType) {
        this.ammoType = ammoType;
    }

    public void setAmmo(Ammo newAmmo){
        this.ammoType = newAmmo;
    }

    public Ammo getAmmo(){
        return this.ammoType;
    }
}