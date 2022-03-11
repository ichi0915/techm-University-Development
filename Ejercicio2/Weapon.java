package Ejercicio2;

import java.util.UUID;

public abstract class Weapon implements items{
    final UUID id = UUID.randomUUID();
    protected String name;
    protected int amount;
    protected int amountLimit;
    protected String type;
    protected double power;

    abstract void setType(String typeString);
    abstract String getType();

    void setPower(double power){
        this.power = power;
    }
    double getPower(){
        return power;
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
