package InventoryGame;

import java.util.UUID;

public class gun extends weapon{
    private ammo ammoType = new ammo();
    private UUID id = UUID.randomUUID();
    public gun (String name, int amount , int amountLimit , double power, String type){
        this.name = name;
        this.amount = amount;
        this.amountLimit = amountLimit;
        this.power = power;
        this.type = type;

    }
    public void setAmmo(ammo ammoType){
        this.ammoType = ammoType;
    }

    public ammo getAmmo(){
        return ammoType;
    }
    

    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public int getAmount(){
        return amount;
    }
    @Override
    public void setAmountLimit (int amountLimit){
        this.amountLimit = amountLimit;
    }

    @Override
    public int getAmountLimit(){
        return amountLimit;
    }
    
    public String toString() {
        return "Gun[id= " + id + " name= " + name + " amount= " + amount + " amountLimit= "+ amountLimit+" type= "+type+" power= "+ power + " ammo= "+ ammoType.getAmount()+"]";
    }

}
