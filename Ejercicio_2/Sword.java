package Ejercicio_2;

public class Sword extends Weapon{
    String handle = "";

    public Sword (String name, double power) {
        setName(name);
        setAmount(1);
        setType("Sword");
        setPower(power);
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public String getInfo() {
        return "Sword information:" + "\n" +
                "Name: " + getName() + "\n" +
                "Type: " + getType() + "\n" +
                "Power: " + getPower();
    }
}
