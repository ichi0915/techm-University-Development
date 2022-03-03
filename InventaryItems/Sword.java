public class Sword extends Weapon {

    String handle= "Camelot Bone Handle";

    @Override
    public void setType(String type) {
    }

    @Override
    public String getType() {
        return type;
    }
    
    public void setHandle(String handle){
        handle = this.handle;
        System.out.println("Handle: "+ handle);
    }

    public String getHandle(){
        return handle;
    }

    public String toString(){
        return "Handle "+handle+ "Type: "+type;
    }
}
