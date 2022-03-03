package EjemploFiguras;

public class Main {
    public static void main (String[] args){
        Circulo figura1 = new Circulo();
        Rectangulo figura2 = new Rectangulo();
        Triangulo figura3 = new Triangulo();

        //CIRCULO
        figura1.setColor("Blue");                   //Asignar un color nuevo       
        figura1.move(3,10,6);                       //Cambiar posiciones      
        figura1.setRadio(1.5);                
        System.out.println(figura1.getColor());     //Imprimir color
        System.out.println(figura1.toString2());    //Imprimir datos generales de la figura
        System.out.println(figura1.getPosition());

        //RECTANGULO
        figura2.setProperties(4.5, 2.5);            //Asignar medidas (largo,ancho)
        figura2.move(2,5,3);                        //Cambiar posiciones
        System.out.println(figura2.toString2());
        System.out.println(figura2.getPosition());

        //TRIANGULO
        figura3.setColor("Yellow");                   //Asignar un color nuevo       
        figura3.move(3,10,6);                       //Cambiar posiciones   
        figura3.setProperties(2.0, 4.0);                     
        System.out.println(figura3.getColor());     //Imprimir color
        System.out.println(figura3.toString2());    //Imprimir datos generales de la figura
        System.out.println(figura3.getPosition());


    }
}
