package clase06_poo_polimorfismo;

public class Main {

	public static void main(String[] args) {

		// GERENTE ES UN ... DESARROLLADOR ===> NO
		// GERENTE ES UN ... EMPLEADO ==> SI
		// DESARROLLADOR ES UN ... EMPLEADO ==> SI
		Gerente gerenteUno = new Gerente("Juan", 28, "Ventas");
		gerenteUno.dirigir();
		gerenteUno.trabajar();

		Desarrollador desarrolladorUno = new Desarrollador("Maria", 35, "Java");
		desarrolladorUno.programar();
		desarrolladorUno.trabajar();


		// GERENTE ES UN ... DESARROLLADOR ===> NO
		// GERENTE ES UN ... EMPLEADO ==> SI
		// DESARROLLADOR ES UN ... EMPLEADO ==> SI

		Empleado[] empleados = new Empleado[3];

		empleados[0] = gerenteUno;
		empleados[1] = desarrolladorUno;
		empleados[2] = new Gerente("Jorge", 40, "RRHH");

		for (Empleado empleado : empleados) {
			System.out.println("el empleado de nombre " + empleado.getNombre());
			System.out.println("es un " + empleado.getClass().getSimpleName());

			empleado.trabajar(); // enlazado dinámico

			if (empleado instanceof Gerente) {
				((Gerente) empleado).dirigir();
			}

			if (empleado instanceof Desarrollador) {
				((Desarrollador) empleado).programar();
			}

			/*
			 * TIPOS PRIMITIVOS EN JAVA
			 * 
			 * int a = 48;
			 * 
			 * byte - short - int - long - float - double
			 * 
			 * 
			 * CASTING IMPLICITO
			 * 
			 * int a = 10;
			 * 
			 * long b = a; (no hay problema, no hay perdida de datos)
			 * 
			 * 
			 * CASTING EXPLICITO
			 * 
			 * double c = 10.5;
			 * 
			 * int d = c; ==> double c = 10.5;
			 * 
			 * 
			 * 
			 * PROMOCION DE TIPOS
			 * 
			 * int e = 10;
			 * 
			 * double f = 20.5;
			 * 
			 * double result = e * f; (10.0 * 20.5)
			 * 
			 * 
			 */

		}
	}
}
