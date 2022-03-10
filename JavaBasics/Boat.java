package JavaBasics;

public class Boat extends Vehicle {
  private boolean isDocked = true;

  public Boat(float maxGas, float maxSpeed) {
    this.maxGas = maxGas;
    this.maxSpeed = maxSpeed;
  }

  public void dock() throws Exception {
    if (this.isDocked) {
      throw new Exception("EXCEPTION: Boat is already docked");
    } else if (this.speed != 0) {
      throw new Exception("EXCEPTION: Can't dock while moving");
    } else {
      this.isDocked = true;
      System.out.println("Boat is docked");
    }
  }

  @Override
  public void accelerate() throws Exception {
    if (this.isDocked) {
      this.isDocked = false;
    }

    super.accelerate();
  }

}
