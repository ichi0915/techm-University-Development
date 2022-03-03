class Gun extends Weapon {
    Ammo ammoType = new Ammo();

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
    public Ammo setAmmo(){
        return setAmmo();
    }
    public Ammo getAmmoType(){
        return ammoType;
    }

}