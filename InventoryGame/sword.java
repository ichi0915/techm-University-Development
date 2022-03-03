package InventoryGame;

import java.util.UUID;

public class sword extends weapon{
    private String handle;
    UUID id = UUID.randomUUID();

    public sword (String name, int amount , int amountLimit ,String handle, double power, String type){
        this.name = name;
        this.amount = amount;
        this.amountLimit = amountLimit;
        this.handle = handle;
        this.power = power;
        this.type = type;

    }
    public void setHandle(String handle){
        this.handle = handle;
    }
    public String getHandle (String handle){
        return handle;
    }
    
    @Override
    public double getPower() {
        return power;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public void setPower(double power) {
        this.power = power ;
        
    }
    @Override
    public void setType(String type) {
        this.type = type;
        
    }
    @Override
    public int getAmount() {
        return amount;
    }
    @Override
    public int getAmountLimit() {
        return amountLimit;
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
    public void setAmountLimit(int amountLimit) {
        this.amountLimit = amountLimit;
        
    }
    @Override
    public void setName(String name) {
        this.name = name;
        
    }
    public UUID getID(){
        return id;
    }
    @Override
    public String toString() {
        return "sword [id= " + id + " name= " + name + " amount= " + amount + " amountLimit= "+ amountLimit+" type= "+type+" power= "+power+ " handle= " + handle + "]";
    }
    
    
}
