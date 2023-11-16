package clase04_funcionesYmetodos;

public class PasoPorValor {

	public static void main(String[] args) {
		
		int numero = 10;
		
		System.out.println("Valor original: " + numero);
		
		modificarValor(numero);
		
		System.out.println("Valor despues de la funcion: " + numero);
	}

	private static void modificarValor(int numero) {
		
		numero = 20;
		System.out.println("Valor modificado dentro de la funcion: "+ numero);
		
	}

}
