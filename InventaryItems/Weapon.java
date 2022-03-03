import java.util.UUID;

public abstract class Weapon implements Item{
    UUID id = UUID.randomUUID();

    String name = "AK47";

    int amount = 200;

    int amountLimit = 5000;

    String type ="Handgun";

    double power = 715;

    @Override
    public void setName(String name) {
        name = this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAmount(int amount) {
        amount = this.amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmountLimit(int amountLimit) {
        amountLimit = this.amountLimit;
    }

    public abstract void setType(String type);

    public abstract String getType();

    public void setPower(double power){
        power = this.power;
    }

    public double getPower(){
        return power;
    }
    
    public String toString(){
        return "\nId: +"+this.id+
        "\nWeapon Type: "+ this.type+ 
        "\nName: "+this.name+
        "\nPower: "+this.power+"m/s"+
        "\nAmount: "+ this.amount+
        "\nAmount Limit: "+ this.amountLimit;
    }
}
