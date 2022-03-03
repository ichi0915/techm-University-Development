package InventoryGame;

import java.util.UUID;

public class ammo implements item{
    UUID id;
    private String name;
    private int amount=30;
    private int amountLimit;
    private String caliber;
    
    public String getCaliber() {
        return caliber;
    }
    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setAmount(int amount){
        this.amount = amount;
    }
    @Override
    public int getAmount(){
        return amount;
    }
    @Override
    public void setAmountLimit(int amountLimit){
        this.amountLimit = amountLimit;
    }
    @Override
    public int getAmountLimit(){
        return amountLimit;
    }
}
