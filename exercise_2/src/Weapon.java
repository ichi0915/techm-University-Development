
abstract class Weapon implements Item {
    int id;
    String name = "9mm";
    int amount;
    int amountLimit;
    String type;
    double power;

    @Override public abstract String getName();

    @Override public abstract int getId();

    @Override public abstract int getAmount();

    @Override public abstract int getAmountLimit();

   public abstract String getType();

   public abstract double getPower();
}