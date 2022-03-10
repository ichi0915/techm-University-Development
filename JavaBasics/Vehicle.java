package JavaBasics;

public abstract class Vehicle {
  protected int speed = 0;
  protected float gas = 0;
  protected float maxGas;
  protected float maxSpeed;
  protected boolean isOn = false;

  public void turnOn() throws Exception {
    if (this.isOn) {
      throw new Exception("EXCEPTION: Vehicle is already on");
    } else if (this.gas <= 0) {
      throw new Exception("EXCEPTION: Vehicle is out of gas");
    } else if (this.maxGas * .01f > this.gas) {
      throw new Exception("EXCEPTION: Not enough gas to turn on the vehicle");
    } else {
      this.isOn = true;
      this.gas -= this.maxGas * .01f;
      System.out.println("Vehicle is on");
    }
  }

  public void turnOff() throws Exception {
    if (!this.isOn) {
      throw new Exception("EXCEPTION: Vehicle is already off");
    } else if (this.speed != 0) {
      throw new Exception("EXCEPTION: Can't turn off while moving");
    } else {
      this.isOn = false;
      System.out.println("Vehicle is off");
    }
  }

  public int getSpeed() {
    System.out.println("Current vehicle speed: " + this.speed);
    return this.speed;
  }

  public void refuel(float gasAmount) throws Exception {
    if (this.isOn) {
      throw new Exception("EXCEPTION: Refueling failed. Vehicle is on");
    } else if (gasAmount > this.maxGas || gasAmount < 0 || gasAmount + this.gas > this.maxGas) {
      throw new Exception("EXCEPTION: Refueling failed. Max gas is " + this.maxGas);
    } else {
      this.gas += gasAmount;
      System.out.println("Refueling succeeded. Gas is now " + this.gas);
    }
  }

  private void canVehicleAccelerateOrBrake() throws Exception {
    if (!this.isOn) {
      throw new Exception("EXCEPTION: Vehicle is off");
    }
  }

  public void accelerate() throws Exception {
    canVehicleAccelerateOrBrake();

    if (this.speed >= this.maxSpeed) {
      throw new Exception("EXCEPTION: Vehicle is at max speed");
    } else if (this.gas == 0) {
      throw new Exception("EXCEPTION: Out of gas");
    } else {
      this.speed += this.maxSpeed * .10;

      if (this.maxGas * .05 > this.gas) {
        this.gas = 0;
      } else {
        this.gas -= this.maxGas * .05;
      }

      System.out.println("Vehicle is accelerating");
    }

    System.out.println("Current vehicle speed: " + this.speed
        + "\nCurrent vehicle gas: " + this.gas);

  }

  public void brake() throws Exception {
    canVehicleAccelerateOrBrake();

    if (this.speed <= 0) {
      throw new Exception("EXCEPTION: Vehicle is already stopped");
    } else if (this.maxSpeed * .10 >= this.speed) {
      this.speed = 0;
      System.out.println("Vehicle stopped");
    } else {
      this.speed -= this.maxSpeed * .10;
      System.out.println("Vehicle is braking");
    }
  }

}
