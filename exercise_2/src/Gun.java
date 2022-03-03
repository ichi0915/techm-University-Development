abstract class Gun extends Weapon {
    Ammo ammoType = new Ammo() {

        @Override public int getId() {
            return Integer.parseInt("The id of the weapon is: " + id);
        }

        @Override public String setName() {
            return null;
        }

        @Override public String getName() {
            return "The name of the weapon is: " + name;
        }

        @Override public int setAmount() {
            return 0;
        }

        @Override public int getAmount() {
            return Integer.parseInt("The amount of the weapon is: " + amount);
        }

        @Override public int getAmountLimit() {
            return Integer.parseInt("The amount limit of the weapon is: " + amountLimit);
        }

        @Override public String setCaliber() {
            return null;
        }

        @Override public String getCaliber() {
            return "The weapon's caliber is: " + caliber;
        }

        @Override public int setAmountLimit() {
            return 0;
        }


        @Override public double getPower() {
            return power;
        }

        public Ammo setAmmoType() {
            return ammoType;
        }

        public Ammo getAmmoType() {
            return setAmmoType();
        }
    };

}/*public class Gun extends Weapon{
    Ammo ammoType = new Ammo();

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
    Ammo setAmmoType(){
        return ammoType;
    }
}*/