package clase03_flujoEjecucion;

public class Main {

	public static void main(String[] args) {
		
		
		// int variable = 78 //error sintaxtico
		
		// ERROR DE LOGICA
		
		// int numerador = 10;
		// int denominador = 0;
		
		// int resultado = numerador / denominador;
		
		// System.out.println(resultado);
		
		
		// PROGRAMACION SECUENCIAL 
		System.out.println("instruccion 1");
		System.out.println("instruccion 2");
		System.out.println("instruccion 3");
		System.out.println("instruccion 4");
		
		// ESTRUCTURA DE CONTROL CONDICIONAL
		
		int edad = 18;
		
		// CONDICIONAL SIMPLE
		
		if (edad >= 18) {
			System.out.println("Sos mayor de edad");
		}
		
		// CONDICIONAL COMPUESTA
		
		if (edad>=18) {
			System.out.println("Sos mayor de edad");
		} else {
			System.out.println("Sos menor de edad");
		}
		
		// CONDICIONALES ANIDADOS
		int hora = 14;
		
		if(hora<12) {
			System.out.println("Buen día");
		} else {
			
			if (hora<18) {
				System.out.println("Buenas tardes");
			} else {
				System.out.println("Buenas noches");
			}
		}
		
		// CONDICIONAL COMPUESTA CON OPERADORADORE LOGICOS
		// (&&, || , !)
		
		int edadBis = 0;
		
		if (edadBis >= 18 && edadBis <= 30) {
			System.out.println("Sos un adulto joven");
		}
		
		if (edadBis< 18 || edadBis > 65) {
			System.out.println("Sos menor de edad o mayor de 65");
		}
		
		if ( !(edadBis < 18) ) {
			System.out.println("No sos menor de edad");
		}
		
		// ESTRUCTURAS DE CONTROL DE REPETICION
		// DE CANTIDAD DETERMINADA
		// FOR
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteración " + i);
		}
		
		// DE CANTIDAD DE REPETICION INDETERMINADA
		// DE AL MENOS UNA EJECUCION
		int contador = 1;
		boolean flag = true;
		do {
			System.out.println("Iteracion " + contador);
			contador++;
			if (contador>5) {
				flag = false;
			}
		} while (flag);
		
		// DE CANTIDAD DE REPETICIONES INDETERMINADAS
		// DE EVALUACION INICIAL
		
		while (flag) {
			System.out.println("Iteracion " + contador);
			contador++;
			if (contador>5) {
				flag = false;
			}
		}
		

	}

}
