package Ejercicio2;

public class Sword extends Weapon{
    public String handle;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
    //Adding the toString method to obtain info about the sword
    @Override
    public String toString(){
        return "Your sword is: "+name+", type: "+type+", handler type: "+handle+
                ", with power range: "+power;
    }
}
