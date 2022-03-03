public class Sword extends Weapon{
    public String handle;

    //_------------------ Methods-----------------
    public void setHandle(String handle){
        this.handle=handle;
    }
    public String getHandle(){
        return handle;
    }
    public String toString(){
        return "Id: "+id+"\nName: "+name+"\nAmount: "+amount+"\n"+
        "AmountLimit: "+amount+"\nHandle: "+handle;
    }
    //-------implemented methods from abstract class----------
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

}
