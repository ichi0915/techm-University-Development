package InventoryGame;

import java.util.UUID;

public class ammo implements item{
    UUID id;
    String name;
    int amount=30;
    int amountLimit;
    String caliber;
    
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
