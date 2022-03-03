package exercise_2;

public class Sword extends Weapon {
  public String handle;

  public Sword(
      String name,
      int amount,
      int amountLimit,
      String type,
      double power,
      String handle) {
    this.name = name;
    this.amount = amount;
    this.amountLimit = amountLimit;
    this.type = type;
    this.power = power;
    this.handle = handle;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public void setName(String name) {
    this.name = name;

  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;

  }

  @Override
  public int getAmount() {
    return this.amount;
  }

  @Override
  public void setAmountLimit(int amountLimit) {
    this.amountLimit = amountLimit;

  }

  @Override
  public int getAmountLimit() {
    return this.amountLimit;
  }

  @Override
  public String toString() {
    return "Sword: " + this.id + " " + this.name + " " + this.amount + " " + this.amountLimit + " " + this.getType()
        + " " + this.getPower() + " " + this.getHandle();
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public String getHandle() {
    return this.handle;
  }

}
