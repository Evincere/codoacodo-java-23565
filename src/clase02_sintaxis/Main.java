package clase02_sintaxis;

public class Main {

	public static void main(String[] args) {
		
		Suma calculadora = new Suma();
		
		int resultado = calculadora.sumar(85, 15);
		
		System.out.println("El resultado de la suma es :" + resultado);
		
		System.out.println("El resultado de la suma es :" + calculadora.sumar(10, 80));
		
		// calculadora.numeroUno = 100;
		// calculadora.numeroDos = 100;
		
		// int resultadoDos = calculadora.sumar(calculadora.numeroUno ,calculadora.numeroDos );
		
		// System.out.println(resultadoDos);
		
		calculadora.sumar();
		
		Suma calculadoraDos = new Suma(50, 25);
		
		calculadoraDos.sumar();
		
		

	}

}
