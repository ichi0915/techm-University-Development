import java.util.*;
public class Ammo implements Item{
    public UUID id=UUID.randomUUID();
    public String name;
    public Integer amount;
    public Integer amountLimit;

    public String caliber;

    //---------------Concrete class methods-------------------
    public String getCaliber(){
        return caliber;
    }
    public void setCaliber(String caliber){
        this.caliber=caliber;
    }

    public String toString(){
        return "Id: "+id+"\nName: "+name+"\nAmount: "+amount+"\n"+
        "AmountLimit: "+amount+"\nCaliber: "+caliber;
    }
    //-----------implemented methods from interface--------------
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAmount(Integer amount){
        this.amount=amount;
    }
    public Integer getAmount(){
        return amount;
    }
    public void setAmountLimit(Integer amountLimit){
        this.amountLimit=amountLimit;
    }
    public Integer getAmountLimit(){
        return amountLimit;
    }
}
