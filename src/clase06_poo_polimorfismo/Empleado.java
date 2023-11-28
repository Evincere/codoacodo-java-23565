package clase06_poo_polimorfismo;

public class Empleado {

	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void trabajar() {
		System.out.println("Realizando tareas generales ...");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
