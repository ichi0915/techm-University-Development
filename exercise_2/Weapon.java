package exercise_2;

import java.util.UUID;

public abstract class Weapon implements Item {
  final UUID id = UUID.randomUUID();
  public String name;
  public int amount;
  public int amountLimit;
  public String type;
  public double power;

  public abstract void setType(String type);

  public abstract String getType();

  public void setPower(double power) {
    this.power = power;
  }

  public double getPower() {
    return this.power;
  }
}
