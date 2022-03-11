abstract class airplane extends Vehicle {

    private boolean isLanded = true;
    @Override public int getSpeed() {
        System.out.println(speed);
            return super.getSpeed();
        }
        public float getGas(){
        if (getSpeed() == 0){
            System.out.println(gas + " LTRS");
        }
        return gas;
    }

    @Override public void getTurnOff() {
        super.turnOff();
    }

    @Override public boolean setTurnOn() {

        if (getSpeed() != 0) {
            super.isOn = true;
        }
        else {
            isOn = false;
        }
        return isOn;
    }

    public void getTurnOn() {
        setTurnOn();
    }



    public float getMaxSpeed (){
        return Float.parseFloat((maxSpeed + " KM/H"));
    }

}