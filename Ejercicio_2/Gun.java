package Ejercicio_2;

public class Gun extends Weapon{
    int ammo = 0;

    public Gun (String name, int amount, int amountLimit) {
        setName(name);
        setAmount(amount);
        setAmountLimit(amountLimit);
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

}
