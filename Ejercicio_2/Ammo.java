package Ejercicio_2;

public class Ammo implements Item{
    String caliber = "";
    String name = "";
    int amount = 0;
    int amountLimit = 0;

    public Ammo(String caliber) {
        this.caliber = caliber;
    }
    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }


    @Override
    public void setName(String weaponName) {
        name = weaponName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAmount(int weaponAmount) {
        amount = weaponAmount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmountLimit(int weaponAmountLimit) {
        amountLimit = weaponAmountLimit;
    }

    @Override
    public int getAmountLimit() {
        return amountLimit;
    }
}
