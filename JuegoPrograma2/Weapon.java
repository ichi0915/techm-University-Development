import java.util.*;
public abstract class Weapon implements Item{
    public UUID id=UUID.randomUUID();
    public String name;
    public Integer amount;
    public Integer amountLimit;

    public String type;
    public Double power;
    
    //-----------------methods---------------
    public abstract void setType(String type);
    public abstract String getType();

    public void setPower(Double power){
        this.power=power;
    }
    public Double getPower(){
        return power;
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
