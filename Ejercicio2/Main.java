package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String args[]){
        Ammo municion = new Ammo();
        Gun arma = new Gun();
        Sword espada = new Sword();
        municion.setName("Simple");
        municion.setAmount(8);
        municion.setAmountLimit(12);
        municion.setCaliber("9mm");
        arma.setName("Glock");
        arma.setAmount(1);
        arma.setAmountLimit(2);
        arma.setType("Automatic");
        arma.setPower(2.1);
        arma.setAmmoType(municion);
        espada.setName("Excalibur");
        espada.setAmount(2);
        espada.setAmountLimit(2);
        espada.setType("Iron");
        espada.setPower(1.6);
        espada.setHandle("Gold");

        JOptionPane.showMessageDialog(null,
                "You got "+(arma.getAmount()+ espada.getAmount())+
                " weapons, "+arma.getAmount()+" guns and "+espada.getAmount()+" swords.\n\n"+
                arma.toString()+", "+arma.getAmmoType().toString()+".\n"+
                        espada.toString()
                );
    }
}
