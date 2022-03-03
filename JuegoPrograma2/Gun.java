public class Gun extends Weapon{
    public Ammo ammoType;

    //---------------- methods-------------
    public void setAmmoType(Ammo ammoType){
        this.ammoType=ammoType;
    }
    public Ammo getAmmoType(){
        return ammoType;
    }

    public String toString(){
        return "Id: "+id+"\nName: "+name+"\nAmount: "+amount+"\n"+
        "AmountLimit: "+amount+"\nType: "+type+"\nPower: "+power+"\nAmmoType: \n"+ammoType.toString();
    }
    //------------------implemented methods from abstract class-----------
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

}
