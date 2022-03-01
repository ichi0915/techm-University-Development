package Formas2;

// Polimorfismo
public class Main {

	private static String getColor(Shape fig) {
		return fig.getColor();
	}

	public static void main(String[] args){
		Shape figura = new Shape();
		Shape2 figura2 = new Shape2();

		System.out.println( figura.getColorProtected() );
		System.out.println( getColor(figura) );
		System.out.println( getColor(figura2) );
	}
}
