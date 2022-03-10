package InventoryGame;
public class Main{
public static void main(String[] args) {


    sword excalibur = new sword("excalibur",1,1,"grande",99.9,"Legendaria");
    gun operator = new gun("operator",1,1,99.9,"epica");
    
    System.out.println(excalibur.toString());
    System.out.println(operator.toString());
    
}
}