package Clases;

//Se puede instanciar
class Concreta {
	private String name;
	public String apellido;

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
	//This class must implement the inherited abstract method Abstracta.getName()
	@Override public String getName(){
		return this.name;
	}
}



//No se puede instanciar, se debe implementar todos los métodos para poder crear una instancia
interface Interfaz{
	public final String defaultName = "Ichi";		//The attributes are static and final
	//private String name;							//Illegal modifier for the interface field Interfaz.name; only public, static & final are permitted
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
//class ConcretaFinalExtend extends ConcretaFinal{}			//The type ConcretaFinalExtend cannot subclass the final class ConcretaFinal



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



//Solo atributos son privados con getters y setters
class POJO {
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}



//Nested Classes, una clase dentro de otra clase(Clases anidadas)
class OuterClass {
	String xName = "OuterClass";

	class InnerClass {
		String yName = "InnerClass";
	}
}



//Anonymous, es una clase anidada la cual no tiene nombre(El nombre no esta expuesto)
class AnonymousDisp {
	public void display() {
		System.out.println("Clase disp");
	}
}
class Anonymous {
	public void createClass() {
		AnonymousDisp anonClass = new AnonymousDisp() {					// Creamos una clase anonima
			public void display() {
				System.out.println("Clase anonima");
			}
		};
		anonClass.display();
	}
}


//Static Inner class
// una clase estática anidada se puede instanciar sin instanciar la clase exterior
class OuterClass2 {
	private static String name = "Ichi Nested Static Class";

	// Static nested class
	public static class NestedStaticClass {

		// Solamente los miembros estaticos son accesibles desde la clase anidada estática
		public String getName(){
			return name;
		}
	}
}


public class Main {
	public static void main(String[] args){
		System.out.println("\n== Ejemplos de los diversos tipos de clases ==");

		// Concreta
		System.out.println("\n\nConcreta:");
		Concreta concretaInst = new Concreta();
		concretaInst.setName("Ichi Concreta");
		System.out.println( concretaInst.getName() );


		// Abstracta
		System.out.println("\n\nAbstracta:");
		// Abstracta abstractaInst = new Abstracta();			//Cannot instantiate the type Abstracta
		AbstractaImpl abstractaInst = new AbstractaImpl();
		abstractaInst.setName("Ichi Abstracta");
		System.out.println( abstractaInst.getName() );


		// Interfaz
		System.out.println("\n\nInterfaz:");
		// Interfaz interfazInst = new Interfaz();			//Cannot instantiate the type InterfazJava
		InterfazImpl interfazImpl = new InterfazImpl();
		interfazImpl.setName("Ichi Interfaz");
		System.out.println( interfazImpl.getName() );


		// Concreta Final
		System.out.println("\n\nConcreta Final:");
		ConcretaFinal concretaFinalInst = new ConcretaFinal();
		concretaFinalInst.setName("Ichi Concreta Final");
		System.out.println( concretaFinalInst.getName() );


		// Singleton
		System.out.println("\n\nSingleton:");
		Singleton x = Singleton.getInstance();			// Instancia x
		Singleton y = Singleton.getInstance();			// Instancia y
		System.out.println("Hashcode of x: " + x.hashCode() + " x.nombre: " + x.nombre);
		System.out.println("Hashcode of y: " + y.hashCode() + " y.nombre: " + y.nombre);


		// POJO
		System.out.println("\n\nPOJO:");
		POJO pojoInst = new POJO();
		pojoInst.setName("Ichi POJO");
		System.out.println( pojoInst.getName() );


		// Clases anidadas
		System.out.println("\n\nOuter/Inner Class:");
		OuterClass myOuter = new OuterClass();
		// OuterClass.InnerClass myInner = new OuterClass.InnerClass();		//No enclosing instance of type OuterClass is accessible.
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.yName + "\n" + myOuter.xName);

		//El scope de cada variable se queda en cada clase
		// System.out.println(myInner.yName + myInner.xName);
		// System.out.println(myOuter.yName + myOuter.xName);


		// Clases Anónima
		System.out.println("\n\nAnonymous Class:");
		Anonymous anonymousInst = new Anonymous();
		anonymousInst.createClass();


		// Clases anidadas estáticas
		System.out.println("\n\nNested Static Class:");
		OuterClass2.NestedStaticClass nestedStaticClass = new OuterClass2.NestedStaticClass();
		System.out.println( nestedStaticClass.getName() );
	}
}
