class Airplane extends Vehicle{

    boolean isLanded;

    Airplane() {
        super.speed = 100;
        super.gas = 90.8f;
    }
    public void land(){
        this.isLanded = true;
    }


    @Override
    public void refuel(float gasAmount) {
        if (this.isLanded){
            super.refuel(gasAmount);
        }
        else{
            System.out.println("\nThe airplane isn't landed. It must land to refuel!");
        }
    }

    @Override
    public void accelerate() {
        super.accelerate();
        this.isLanded = false;
    }

    @Override
    public void brake() {
        super.brake();
    }

}
