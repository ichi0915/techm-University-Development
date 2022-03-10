
import java.util.UUID;
public abstract class Weapon implements Item {
    public UUID uuid = UUID.randomUUID();
    public String name;
    public int amount;
    public int amountLimit;

    public String type;
    public double power;

    @Overiide
    public String getName() {
        return name;
    }

    @Ovveride
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    private int getAmountLimit() {
        return amountLimit;
    }

    @Override
    public void setAmountLimit(int amountLimit) {
        this.amountLimit = amountLimit;
    }

    public String getType()
        return type;

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Name" + getName() + ", Amount " + getAmount() + ", Amount Limit:" +
                getAmountLimit() + ", Type " + getType() + ", Power " + getPower();

    }
}