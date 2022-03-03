
abstract class Weapon implements Item {
    int id;
    String name;
    int amount;
    int amountLimit;
    String type;
    double power;

    @Override public String getName() {
        return name;
    }

    @Override public int getId() {
        return id;
    }

    @Override public int getAmount() {
        return amount;
    }

    @Override public int getAmountLimit() {
        return amountLimit;
    }

    public String setType(){
        return setType();
    }
    public String getType() {
        return this.setType();
    }

    public double setPower() {
        return setPower();
    }

    public double getPower() {
        return this.setPower();
    }
}