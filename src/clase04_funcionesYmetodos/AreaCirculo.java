package clase04_funcionesYmetodos;

import javax.swing.JOptionPane;

public class AreaCirculo {
	
	
	public static void main(String[] args) {
		// solicitar al usuario que ingrese el radio del circulo
		String radioStr = JOptionPane.showInputDialog("Ingrese el radio del circulo");
		
		// convertir el valor ingresado a un double
		
		Double radio = Double.parseDouble(radioStr);
		
		// verificar si se ingreso un dato valido
		
		if (radio <= 0) {
			JOptionPane.showMessageDialog(null, "NO SE PERMITEN NUMEROS NEGATIVOS");
		} else {
			
			double area = calcularArea(radio); 
			mostrarResultado(area);
		}
		
	}

	private static void mostrarResultado(double area) {
		String mensaje = "El area del circulo es: " + area;
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}

	private static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2); // 3.14 * (radio * radio)
	}
	

}
