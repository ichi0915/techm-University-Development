
interface Item{
default String setName(){
    return toString();
}

    default String getName(){
        return this.setName();
    }

    default int setAmount() {
        return 0;
    }

    default int getAmount(){
        return this.setAmount();
    }

    default int getAmountLimit(){
        return 0;
    }

    default int setAmountLimit(){
        return getAmountLimit();
    }

    int getId();
}

class item {
    public static void main(String arg[]){
        Gun gun = new Gun();
        System.out.println(gun.getAmmoType());

        Sword sword = new Sword();
        System.out.println(sword.getHandle());

    }

}

