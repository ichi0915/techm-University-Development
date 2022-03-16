class Boat extends Vehicle {

    boolean isDocked;


    Boat(){
        super.speed = 35;
        super.gas = 101.5f;
    }

    public void dock(){
        this.isDocked = true;
    }


    @Override
    public Integer getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void refuel(float gasAmount) {
        if (this.isDocked){
            super.refuel(gasAmount);
        }
        else{
            System.out.println("\nThe boat isn't docked. It must be docked to refuel!");
        }
    }

    @Override
    public void accelerate() {
        super.accelerate();
        this.isDocked = false;
    }

    @Override
    public void brake() {
        super.brake();
    }

}
