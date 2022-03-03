package InventoryGame;
public class main{
public static void main(String[] args) {


    sword excalibur = new sword("excalibur",1,1,"grande",99.9,"Legendaria");
    gun operator = new gun("operator",1,1,99.9,"epica");
    gun operator2 = new gun("operator2",1,1,99.9,"epica");
    
    System.out.println(excalibur.toString());
    System.out.println(operator.toString());
    System.out.println(operator2.toString());
    
}
}