package Clases;

//cd /Users/juanguitron/Documents/Codigos/ClaseOOP ; /usr/bin/env /Users/juanguitron/.sdkman/candidates/java/11.0.12-tem/bin/java -cp "/Users/juanguitron/Library/Application Support/Code/User/workspaceStorage/7664b22ff9f281e4405d04f1ea7ced32/redhat.java/jdt_ws/ClaseOOP_f0d60d57/bin" Clases.Main

//Se puede instanciar
class Concreta {
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}



//No se puede instanciar, se debe extender e implementar los metodos para poder crear una instancia
abstract class Abstracta {
	protected String name;

	public void setName(String name){
		this.name = name;
	}

	public abstract String getName();
}
//Extendemos e implementamos para poder instanciar
class AbstractaImpl extends Abstracta{
	@Override public String getName(){
		return this.name;
	}
}



//No se puede instanciar, se debe implementar todos los métodos para poder crear una instancia
interface Interfaz{
	public String defaultName = "Ichi";					//The attributes are static and final
	public void setName(String name);
	public String getName();
}
//implementamos los métodos
class InterfazImpl implements Interfaz{
	private String name;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}



//Se puede instanciar, pero no se puede extender
final class ConcretaFinal {
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}
//Error no podemos extender
//class ConcretaFinalExtend extends ConcretaFinal{}



class Singleton {
	private static Singleton single_instance = null;			// Referencia estatica de mi instancia

	public String nombre;

	// Constructor privado el cual solo la clase puede usar
	private Singleton(){
		nombre = "ichi singleton";
	}

	// Methodo estatic en donde creamos la instancia
	public static Singleton getInstance(){
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}



public class Main {
	public static void main(String[] args){
		System.out.println("Ejemplos de los diversos tipos de clases");

		// Concreta
		Concreta concretaInst = new Concreta();
		concretaInst.setName("Ichi Concreta");
		System.out.println( concretaInst.getName() );

		Singleton x = Singleton.getInstance();			// Instancia x
		Singleton y = Singleton.getInstance();			// Instancia y
		System.out.println("Hashcode of x is " + x.hashCode() + " x.nombre:" + x.nombre);
		System.out.println("Hashcode of y is " + y.hashCode() + " y.nombre:" + y.nombre);

	}
}
