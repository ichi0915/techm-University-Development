package Armas;

import java.util.UUID;

public interface Item {

    public void setName(String name);
    public String getName();

    public void setAmong(String name);


    public Integer getAmount();

    public void setAmountLimit(String name);
    public Integer getAmountLimit();
}

abstract class Weapon implements Item{
    String type;
    Double power;

    UUID id = null;
    String name = "";
    Integer among = 0;
    Integer amongLimit = 0;

    abstract void setType(String type);						// Método abstracto
    abstract String getType();                              // Método abstracto
    public void setPower(Double power)
    {
        this.power = power;
    }
    public Double getPower(){
        return power;
    }
}

 class Ammo implements Item{
    String caliber;

     UUID id = null;
     String name = "";
     Integer among = 0;
     Integer amongLimit = 0;


    public String getCaliber(){
        return caliber;
    }
     public void setCaliber(String power)
     {
         this.caliber = caliber;
     }

     @Override
     public void setName(String name) {

     }

     @Override
     public String getName() {
         return null;
     }

     @Override
     public void setAmong(String name) {

     }

     @Override
     public Integer getAmount() {
         return null;
     }

     @Override
     public void setAmountLimit(String name) {

     }

     @Override
     public Integer getAmountLimit() {
         return null;
     }
 }

class Gun extends Weapon{
    Ammo ammoType;

    public void setAmmo(Ammo ammo)
    {
        this.ammoType = ammo;
    }
    public Ammo getAmmo(){
        return ammoType;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setAmong(String name) {

    }

    @Override
    public Integer getAmount() {
        return null;
    }

    @Override
    public void setAmountLimit(String name) {

    }

    @Override
    public Integer getAmountLimit() {
        return null;
    }

    @Override
    void setType(String type) {

    }

    @Override
    String getType() {
        return null;
    }
}

class Sword extends Weapon{
    String handle;

    public void setHandle(String handle)
    {
        this.handle = handle;
    }
    public String getHandle(){
        return handle;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setAmong(String name) {

    }

    @Override
    public Integer getAmount() {
        return null;
    }

    @Override
    public void setAmountLimit(String name) {

    }

    @Override
    public Integer getAmountLimit() {
        return null;
    }

    @Override
    void setType(String type) {

    }

    @Override
    String getType() {
        return null;
    }
}

class Arma{
    public static void main(String args[]) {

        System.out.println("== Items ==");


        //Item miitem = new Item();
        Weapon miweapon = new Weapon() {
            @Override
            void setType(String type) {

            }

            @Override
            String getType() {
                return null;
            }

            @Override
            public void setName(String name) {

            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public void setAmong(String name) {

            }

            @Override
            public Integer getAmount() {
                return null;
            }

            @Override
            public void setAmountLimit(String name) {

            }

            @Override
            public Integer getAmountLimit() {
                return null;
            }
        };

        System.out.println( miweapon.getName() );
        System.out.println( miweapon.getPower());
        System.out.println( miweapon.getAmount() );

    }
}


