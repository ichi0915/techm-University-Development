import java.util.UUID;

abstract class Weapon implements Item{
    UUID uuid=UUID.randomUUID();
    int id ;
    String name;
    int amount;
    int amountLimit;

    String type;
    Double power;

    abstract public void setType(String type);

    abstract public String getType();

    public void setPower(Double power){
        this.power = power;
    }

    public Double getPower(){
        return this.power;
    }

    

    //-----------Metodos de interfaz ITEM----------------
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
