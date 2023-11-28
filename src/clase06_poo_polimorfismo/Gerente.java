package clase06_poo_polimorfismo;

public class Gerente extends Empleado {

	
	private String departamento;
	
	public Gerente(String nombre, int edad, String departamento) {
		
		super(nombre, edad);
		this.departamento = departamento;
	}
	
	public void dirigir() {
		System.out.println("Dirigiendo el departamento " + this.departamento);
	}
	
	public void trabajar() {
		System.out.println("Trabajo gerenciando");
	}
	
}
