package Ejercicio_2;

public class Gun extends Weapon{
    Ammo myAmmo = new Ammo("9mm");

    public Gun (String name, int amount, int amountLimit, double power) {
        setName(name);
        setAmount(amount);
        setAmountLimit(amountLimit);
        setType("Gun");
        setPower(power);
    }

    public void setAmmo(String caliber) {
        myAmmo.setCaliber(caliber);
    }
    public Ammo getAmmo() {
        return myAmmo;
    }
    public String getInfo() {
        return "Gun information:" + "\n" +
                "Name: " + getName() + "\n" +
                "Amount: " + getAmount() + "\n" +
                "AmountLimit: " + getAmountLimit() + "\n" +
                "Type: " + getType() + "\n" +
                "Power: " + getPower() + "\n" +
                "Caliber: " + myAmmo.getCaliber();
    }
}
