
/*abstract class Sword extends Weapon {
    String handle;


    @Override public int getId() {
        return id;
    }
    @Override public String getName() {
        return name;
    }
    @Override public String getType() {
        return type;
    }
    @Override public int getAmount() {
        return amount;
    }
    @Override public int getAmountLimit() {
        return amountLimit;
    }
    @Override public double getPower() {
        return power;
    }
    public String setHandle(){
        return setName();
    }
    public String getHandle(){
        return this.setHandle();
    }


}*/
public class Sword extends Weapon{
    String handle;

    @Override
    public String setName() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int setAmount() {
        return 0;
    }

    @Override
    public int getId() {
        return id;
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
    public int setAmountLimit() {
        return 0;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPower() {
        return power;
    }

    public String getHandle(){
        return handle;
    }
}