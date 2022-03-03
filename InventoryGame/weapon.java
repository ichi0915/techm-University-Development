package InventoryGame;

import java.util.UUID;

abstract class weapon implements item {
    protected UUID id;
    protected String name;
    protected int amount;
    protected int amountLimit;
    protected String type;
    protected double power;

    public void setType(String type){
        this.type = type;
    };
    public String getType(){
        return type;
    };
    public void setPower(double power){
        this.power = power;
    };
    public double getPower(){
        return power;
    };
}
