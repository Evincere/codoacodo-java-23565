package clase06_poo_polimorfismo;

public class Desarrollador extends Empleado  {

	
	private String lenguaje;
	
	
	public Desarrollador(String nombre, int edad, String lenguaje) {
		super(nombre, edad);
		this.lenguaje = lenguaje;
	}
	
	public void programar() {
		System.out.println("Programando en " + lenguaje);
	}
	
	public void trabajar() {
		System.out.println("Trabajo programando");
	}
	
	
}
