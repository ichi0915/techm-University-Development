
public class Main {
    public static void main (String[] args){
        
        //Items 
        Sword item1 = new Sword();
        Gun item2 = new Gun();
        Ammo ammoItem = new Ammo();


        //Sword
        item1.setName("Sable X");
        System.out.println(item1.getStatus());
        item1.setAmount(5);
        item1.setAmountLimit(15);
        System.out.println(item1.getStatus());

        //Gun
        item2.setName("Pistola Y");
        item2.setType("Gun");
        item2.setAmmo(ammoItem);
        item2.ammoType.setCaliber("10 mm Auto");
        System.out.println(item2.getStatus());        

    }
}