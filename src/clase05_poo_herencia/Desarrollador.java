package clase05_poo_herencia;

public class Desarrollador extends Empleado  {

	
	private String lenguaje;
	
	
	public Desarrollador(String nombre, int edad, String lenguaje) {
		super(nombre, edad);
		this.lenguaje = lenguaje;
	}
	
	public void programar() {
		System.out.println("Programando en " + lenguaje);
	}
	
	
}
