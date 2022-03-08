package Ejercicio_2;
import java.util.UUID;

public abstract class Weapon implements Item {
    UUID uuid = UUID.randomUUID();
    String name = "";
    int amount = 0;
    int amountLimit = 0;
    String type = "";
    Double power = 0.0;

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

    public void setType(String weaponType) {
        type = weaponType;
    }
    public String getType() {
        return type;
    }
    public void setPower(Double weaponPower) {
        power = weaponPower;
    }
    public Double getPower() {
        return power;
    }
}
