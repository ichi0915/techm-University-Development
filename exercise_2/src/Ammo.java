/*abstract class Ammo implements Item{
    int id;
    String name ;
    int amount;
    int amountLimit;
    String caliber;

    @Override public String getName(){
        return name;
    }
    @Override public  int getId(){
        return id;
    }

    public abstract String getType();

    @Override public int getAmount(){
        return amount;
    }
    @Override public int getAmountLimit(){
        return amountLimit;
    }


    public abstract String setCaliber();
    public abstract String getCaliber();


    public abstract double getPower();
}*/

public abstract class Ammo implements Item{
    int id;
    String name ;
    int amount;
    int amountLimit;
    String caliber;

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
    public int getId() {
        return id;
    }

    public abstract String setCaliber();

    public  String getCaliber(){
        return caliber;
    }

    public abstract double getPower();
}