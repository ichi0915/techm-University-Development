package JavaBasics;

public class Airplane extends Vehicle {
  public boolean isLanded = true;

  public Airplane(float maxGas, float maxSpeed) {
    this.maxGas = maxGas;
    this.maxSpeed = maxSpeed;
  }

  public void land() throws Exception {
    if (this.isLanded) {
      throw new Exception("EXCEPTION: Airplane is already landed");
    } else if (this.speed != 0) {
      throw new Exception("EXCEPTION: Can't land while moving");
    } else {
      this.isLanded = true;
      System.out.println("Airplane is landed");
    }
  }

  @Override
  public void accelerate() throws Exception {
    if (this.isLanded) {
      this.isLanded = false;
    }

    super.accelerate();
  }

  @Override
  public void turnOff() throws Exception {
    if (!this.isLanded) {
      throw new Exception("EXCEPTION: Can't turn off while flying");
    } else {
      super.turnOff();
    }
  }
}
