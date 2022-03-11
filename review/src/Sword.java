class Sword extends Weapon{
    String handle;

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override void setType(String type) {

    }

    @Override String getType() {
        return this.type;
    }

    @Override void setPower(double power) {

    }

    @Override double getPower() {
        return this.power;
    }

    @Override public void setName(String name) {

    }

    @Override public String getName() {
        return this.name;
    }

    @Override public void setAmount(int amount) {

    }

    @Override public int getAmount() {
        return this.amount;
    }

    @Override public void setAmountLimit(int amountLimit) {

    }

    @Override public int getAmountLimit() {
        return this.amountLimit;
    }
}
