class Car extends Vehicle{


    Car(){
        super.speed = 50;
        super.gas = 50.9f;
    }

    @Override
    public Integer getSpeed() {
        return super.getSpeed();
    }



    @Override
    public void refuel(float gasAmount) {
        super.refuel(gasAmount);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }

}
