package clase06_poo_polimorfismo;

public abstract class Empleado {

	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract void trabajar();
	

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
