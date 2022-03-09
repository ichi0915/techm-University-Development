package Ejercicio2;

import java.util.UUID;

public abstract class Weapon implements items{
    UUID id = UUID.randomUUID();
    String name;
    int amount;
    int amountLimit;
    String type;
    double power;

    abstract void setType(String typeString);
    abstract String getType();

    void setPower(double power){
        this.power = power;
    }
    double getPower(){
        return power;
    }

    public Weapon(String name, int amount, int amountLimit, String type, double power) {
        this.name = name;
        this.amount = amount;
        this.amountLimit = amountLimit;
        this.type = type;
        this.power = power;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public int getAmount() {
        return amount;
    }
    @Override
    public void setAmountLimit(int amountLimit) {
        this.amountLimit = amountLimit;
    }
    @Override
    public int getAmountLimit() {
        return amountLimit;
    }
    @Override
    public String toString() {
        return name + " amount: " + amount + " limit: " + amountLimit + " type: " + type + " power: " + power;
    }
}
