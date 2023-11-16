package clase04_funcionesYmetodos;

import java.util.Arrays;

public class PasoPorReferencia {

	public static void main (String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5};
		
		System.out.println("Array original: " + Arrays.toString(array));
		
		modificarArray(array);
		
		System.out.println("Array despues del llamado a la funcion " + array[0]);
		
		
	}

	private static void modificarArray(int[] array) {
		
		array[0] = 10;
		System.out.println("Array modificado dentro de la funcion: " + Arrays.toString(array));
	}
}
