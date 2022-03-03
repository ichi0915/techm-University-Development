class Sword extends Weapon{

    String handle;


    public void setHandle(String handle){
        this.handle = handle;
    }

    public String getHandle(){
        return this.handle;
    }

    public String getStatus(){
  
        return "\n----Weapon Status----\n Name: "+this.name+"\n Amount: "+this.amount
        +"\n Amount Limit: "+this.amountLimit
        +"\n Type: "+this.type+"\n Handle: "+this.handle+"\n---------------------";
        //handkeer
    }

}