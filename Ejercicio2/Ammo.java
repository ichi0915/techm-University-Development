package Ejercicio2;

import java.util.UUID;

public class Ammo implements Item{
    public UUID id;
    public String name;
    public int amount;
    public int amountLimit;

    public String caliber;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmountLimit() {
        return amountLimit;
    }

    @Override
    public void setAmountLimit(int amountLimit) {
        this.amountLimit = amountLimit;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }
}
