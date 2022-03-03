package exercise_2;

import java.util.UUID;

public class Ammo implements Item {
  final UUID id = UUID.randomUUID();
  public String name;
  public int amount;
  public int amountLimit;
  public String caliber;

  public Ammo(
      String name,
      int amount,
      int amountLimit,
      String caliber) {
    this.name = name;
    this.amount = amount;
    this.amountLimit = amountLimit;
    this.caliber = caliber;
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
    return "Ammo: " + this.id + " " + this.name + " " + this.amount + " " + this.amountLimit + " " + this.getCaliber();
  }

  public String getCaliber() {
    return this.caliber;
  }

  public void setCaliber(String caliber) {
    this.caliber = caliber;
  }

}
