package clase05_poo_herencia;

import clase06_poo_polimorfismo.Desarrollador;
import clase06_poo_polimorfismo.Gerente;

public class Main {

	public static void main(String[] args) {
//	 	GERENTE	ES UN ... DESARROLLADOR ===> NO
		// GERENTE ES UN ... EMPLEADO ==> SI
		// DESARROLLADOR ES UN ... EMPLEADO ==> SI
		Gerente gerenteUno = new Gerente("Juan", 28, "Ventas");
		gerenteUno.dirigir();
		gerenteUno.trabajar();

		Desarrollador desarrolladorUno = new Desarrollador("Maria", 35, "Java");
		desarrolladorUno.programar();
		desarrolladorUno.trabajar();

	}

}
