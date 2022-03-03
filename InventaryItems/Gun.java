public class Gun extends Weapon {

    Ammo ammoType= new Ammo();

    @Override
    public void setType(String type) {
    }

    @Override
    public String getType() {
        return type;
    }

    public void setAmmo(Ammo ammoType){
        System.out.println("The ammo type is " + ammoType);
    }
    
    public Ammo getAmmo(){
        return ammoType;
    }

    
}
