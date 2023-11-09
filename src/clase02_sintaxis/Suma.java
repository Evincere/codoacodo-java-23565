package clase02_sintaxis;

public class Suma {
	
	// ATRIBUTOS DE INSTANCIA O DE CLASE (static) 
	// modificador acceso + tipo de dato + nombre + ;
	
	// public int numeroUno, numeroDos;
	private int numeroUno;
	private int numeroDos;
	
	
	// CONSTRUCTOR VACIO
	public Suma() {
		System.out.println("Se ha llamado al metodo constructor vacio");
	}
	
	// CONSTRUCTOR CON PARAMETROS
	public Suma(int numeroUno, int numeroDos) {
		System.out.println("Se ha llamado al metodo constructor parametrizado");
		this.numeroUno = numeroUno;
		this.numeroDos = numeroDos;
		
	}
	
	
	
	
	// METODOS ==> FUNCIONES DE LOS OBJETOS
	// modificador de acceso + tipo de retorno (tipo de dato o void) + nombre y los () { }

	public int sumar(int numeroUno, int numeroDos) {
		
		return numeroUno + numeroDos;
		
	}
	
	public void sumar() {
		System.out.println("El resultado utilizando el metodo sin parametros es:" + (this.numeroUno + this.numeroDos));
	}
	
	
	
	
	
	
	
}
