package clase03_flujoEjecucion.practica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		
		// objeto de tipo Scanner
		
		Scanner teclado = new Scanner(System.in); 
		
		// pedimos al usuario que ingrese un numero
		
		System.out.println("Ingrese un numero para ver su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		
		// Mostramos la tabla de multiplicar utilizando un bucle for
		System.out.println("Tabla de multiplicar del " + numero + ":");
		
		for (int i= 1; i<=10; i++) {
			System.out.println(numero * i);
		}
		
		teclado.close();
		
	}

}
