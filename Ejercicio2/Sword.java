package Ejercicio2;

public class Sword extends Weapon{
    private String handle;

    public Sword(String name, int amount, int amountLimit, String type, double power, String handle) {
        this.name = name;
        this.amount = amount;
        this.amountLimit = amountLimit;
        this.type = type;
        this.power = power;
        this.handle = handle;
    }

    void setHandle(String handle){
        this.handle= handle;
    }

    String getHandle() {
        return handle;
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    @Override
    String getType() {
        return type;
    }  
}
