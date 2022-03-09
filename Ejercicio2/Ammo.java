package Ejercicio2;

import java.util.UUID;

public class Ammo implements items{
    UUID id = UUID.randomUUID();
    String name;
    int amount;
    int amountLimit;
    String caliber;

    public Ammo(String caliber) {
        this.caliber = caliber;
    }

    void setCaliber(String caliber) {
        this.caliber = caliber;
    }
    String getCaliber(){
        return caliber;
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
    
}
