import java.util.UUID;

class Ammo implements Item{
    UUID id=UUID.randomUUID(); // ???
    String name;
    int amount;
    int amountLimit;

    String caliber;

    public String getCaliber(){
        return this.caliber;
    }

    
    public void setCaliber(String caliber){
        this.caliber = caliber;
    }

    //Metodos de interfaz:
    
    @Override
    public void setName(String nombre){
        this.name = nombre;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setAmount(int cantidad){
        this.amount = cantidad;
    }

    @Override
    public int getAmount(){
        return this.amount;
    }

    @Override
    public void setAmountLimit(int cantidadMax){
        this.amountLimit = cantidadMax;
    };
    @Override
    public int getAmountLimit(){
        return amountLimit;
    };


}
