import java.util.UUID;
abstract class Weapon implements Item {
    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();
    String name;
    int amount;
    int amountLimit;
    String type;
    double power;

    abstract void setType (String type);
    abstract String getType();

    abstract void setPower(double power);
    abstract double getPower();

    @Override public abstract void setName(String name);

    @Override public abstract String getName();

    @Override public abstract void setAmount(int amount);

    @Override public abstract int getAmount();

    @Override public abstract void setAmountLimit(int amountLimit);

    @Override public abstract int getAmountLimit();
}
