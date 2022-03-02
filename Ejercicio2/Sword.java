package Ejercicio2;

public class Sword extends Weapon{
    public String handle;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type=type;
    }

    @Override
    public Double getPower() {
        return power;
    }

    @Override
    public void setPower(Double power) {
        this.power=power;
    }
}
