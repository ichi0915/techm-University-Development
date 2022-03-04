class Gun extends Weapon {

    Ammo ammoType = new Ammo();


//Cambios realizados - Implementar metodos de Weapon
    @Override
    public void setType(String tipo){
        this.type = "Guns";
    }

    @Override
    public String getType(){
        return this.type;
    }
//---------------------------------------------------


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
