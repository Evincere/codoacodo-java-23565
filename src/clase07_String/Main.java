package clase07_String;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		// solicitar al usuario que ingrese su nombre
		
		System.out.print(Color.BLUE + "Ingrese su nombre: " + Color.RESET);
		String nombre = scanner.nextLine();
		
		// mostrar el nombre
		System.out.println("El nombre ingresado es: " + Color.BG_GREEN + nombre + Color.RESET);
		
		// obtener la longitud de la cadena  de caracteres
		
		int longitudNombre = nombre.trim().length();
		
		System.out.println("La longitud del nombre es : " + longitudNombre);
		
		// Convertir el nombre a mayúsculas o minusculas
		String nombreMayusculas = nombre.toUpperCase();
		String nombreMinusculas = nombre.toLowerCase();
		
		System.out.println(nombreMayusculas);
		System.out.println(nombreMinusculas);

		// verificar si el nombre contiene un caracter especifico
		
		System.out.print("Ingresa el caracter a buscar en el nombre :" );
		String letra = scanner.nextLine();
		
		if(nombre.toLowerCase().contains(letra.toLowerCase())) {
			System.out.println("El nombre tiene la letra : " + letra);
		} else {
			System.out.println("El nombre"+ Color.BG_RED+"NO"+Color.RESET +" tiene la letra : " + letra);
		}
		
		// Comparar el nombre ingresado con otro nombre
		System.out.print("Ingrese un nombre para comparar : ");
		String otroNombre = scanner.nextLine();
		
		if(nombre.toLowerCase().equals(otroNombre.toLowerCase())) {
			System.out.println("Los nombres ingresados son iguales");
		}else {
			System.out.println("Los nombres ingresados NO son iguales");
		}
		
		
		scanner.close();
		
		
		
	}

}
