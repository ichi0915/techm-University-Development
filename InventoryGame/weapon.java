package InventoryGame;

import java.util.UUID;

abstract class weapon implements item {
    protected UUID id;
    protected String name;
    protected int amount;
    protected int amountLimit;
    protected String type;
    protected double power;

    public abstract void setType(String type);
    public abstract String getType();
    public abstract void setPower(double power);
    public abstract double getPower();
}
