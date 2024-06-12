package cl.calculadora.modelo;

public class Operaciones {


	
	public static int restar(int num1, int num2) {
		int resultado = 0;
		
		resultado = num2-num1;
		
		return resultado;
	}
	
	
	public  static int sumar(int num1, int num2) {
		int resultado = 0;
		resultado = num2+num1;
		return resultado;
	}

	public static int multiplicar(int num1, int num2) {
		int resultado = 0;
		resultado = num2*num1;
		return resultado;
	}
	
	public static int dividir(int num1, int num2) {
		
		if(num1 ==0) {
			
			throw new ArithmeticException("Error: No divisible por 0");
		}
		int resultado = num2/num1;
		return resultado;
	
	}
	
	
}
