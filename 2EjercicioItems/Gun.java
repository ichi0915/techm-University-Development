class Gun extends Weapon {

    Ammo ammoType = new Ammo();

    public void setAmmo(Ammo newAmmo){
        this.ammoType = newAmmo;
    }
    
    public Ammo getAmmo(){
        return this.ammoType;
    }

    public String getStatus(){
  
        return "\n----Weapon Status----\n Name: "+this.name+"\n Amount: "+this.amount
        +"\n Amount Limit: "+this.amountLimit
        +"\n Type: "+this.type+"\n Caliber: "+this.ammoType.caliber+"\n---------------------";
        
    }

}
