package Ejercicio_2;

public class Sword extends Weapon{
    String handle = ""; //No supe a qué se refería con este atributo, así que lo dejé en blanco

    public Sword (String name, double power) {
        setName(name);
        setAmount(1);
        setType("Sword");
        setPower(power);
    }

    public void setHandle(String caliber) {

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
