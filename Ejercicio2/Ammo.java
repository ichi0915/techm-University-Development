package Ejercicio2;

import java.util.UUID;

public class Ammo implements Item{

    public UUID id = UUID.randomUUID();
    public String name;
    public Integer amount;
    public Integer amountLimit;
    public String caliber;

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAmount(Integer amount) {
        this.amount=amount;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }

    @Override
    public void setAmountLimit(Integer amountLim) {
        this.amountLimit=amountLim;
    }

    @Override
    public Integer getAmountLimit() {
        return amountLimit;
    }

    //Adding the toString method to obtain info about the ammo
    @Override
    public String toString(){
        return "ammo type: "+name+", with caliber: "+caliber;
    }
}
