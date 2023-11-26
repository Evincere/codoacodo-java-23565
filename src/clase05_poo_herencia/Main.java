package clase05_poo_herencia;

public class Main {

	public static void main(String[] args) {
		
		
					// 	GERENTE	ES UN ... DESARROLLADOR ===> NO
					//  GERENTE ES UN ... EMPLEADO ==> SI
					//  DESARROLLADOR ES UN ... EMPLEADO ==> SI
		Gerente gerenteUno = new Gerente("Juan", 28, "Ventas");
		gerenteUno.dirigir();
		gerenteUno.trabajar();
		
		Desarrollador desarrolladorUno = new Desarrollador("Maria", 35, "Java");
		desarrolladorUno.programar();
		desarrolladorUno.trabajar();
		
		String varUno = "Semper ";
		String varDos = "Semper";
		
		System.out.println(varUno.trim().hashCode() + "**" + varDos.hashCode());
	}

}
