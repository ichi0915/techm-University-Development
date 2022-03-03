package exercise_2;

public class Gun extends Weapon {
  public Ammo ammoType;

  public Gun(
      String name,
      int amount,
      int amountLimit,
      String type,
      double power,
      Ammo ammoType) {
    this.name = name;
    this.amount = amount;
    this.amountLimit = amountLimit;
    this.type = type;
    this.power = power;
    this.ammoType = ammoType;
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
    return "Gun: " + this.id + " " + this.name + " " + this.amount + " " + this.amountLimit + " " + this.getType() + " "
        + this.getPower() + " " + this.ammoType.getName();
  }

  public void setAmmo(Ammo ammoType) {
    this.ammoType = ammoType;
  }

  public Ammo getAmmo() {
    return this.ammoType;
  }

}
