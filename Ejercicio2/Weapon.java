package Ejercicio2;

import java.util.UUID;

public abstract class Weapon implements Item{

    public UUID id = UUID.randomUUID();
    public String name;
    public Integer amount;
    public Integer amountLimit;
    public String type;
    public Double power;

    public String getType(){
        return type;
    };

    public void setType(String type){
        this.type=type;
    };

    public Double getPower(){
        return power;
    };

    public void setPower(Double power){
        this.power=power;
    };

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
    public void setAmountLimit(Integer amountLimit) {
        this.amountLimit=amountLimit;
    }

    @Override
    public Integer getAmountLimit() {
        return amountLimit;
    }

}