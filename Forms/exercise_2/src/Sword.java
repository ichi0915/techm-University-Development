
class Sword extends Weapon {
    String handle;


    @Override public int getId() {
        return id;
    }
    @Override public String getName() {
        return name;
    }
    @Override public String getType() {
        return super.getType();
    }
    @Override public int getAmount() {
        return amount;
    }
    @Override public int getAmountLimit() {
        return amountLimit;
    }
    @Override public double getPower() {
        return super.getPower();
    }
    public String setHandle(){
        return setName();
    }
    public String getHandle(){
        return this.setHandle();
    }


}