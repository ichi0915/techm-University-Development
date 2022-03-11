import java.util.UUID;

abstract class Ammo implements Item {
    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();
    String name;
    int amount;
    int amountLimit;
    String caliber;

    abstract void setCaliber(String caliber);
    abstract String getCaliber ();

    @Override public abstract void setName(String name);

    @Override public abstract String getName();

    @Override public abstract void setAmount(int amount);

    @Override public abstract int getAmount();

    @Override public abstract void setAmountLimit(int amountLimit);

    @Override public abstract int getAmountLimit();
}
