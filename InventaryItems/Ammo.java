import java.util.UUID;

public class Ammo implements Item {

    UUID id = UUID.randomUUID();

    String name="Long rifle";

    int amount= 40;

    int amountLimit = 5000;

    String caliber="7.62 mm / 5.5mm";

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
    
    public void setCaliber(String caliber){
        caliber = this.caliber;
    }

    public String getCaliber(){
        return caliber;
    }
    @Override
    public String toString(){
        return "\nId: +"+this.id+ 
        "\nName: "+this.name+
        "\nCaliber: "+this.caliber+
        "\nAmount: "+ this.amount+
        "\nAmount Limit: "+ this.amountLimit;
    }
}
