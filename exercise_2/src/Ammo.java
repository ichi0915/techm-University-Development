class Ammo implements Item{
    int id;
    String name ;
    int amount;
    int amountLimit;
    String caliber;

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

    public String setCaliber(){
        return setCaliber();
    }
    public String getCaliber() {
        return this.setCaliber();
    }


}