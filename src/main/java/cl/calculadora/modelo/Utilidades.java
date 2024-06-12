package cl.calculadora.modelo;

public class Utilidades {

	
	public static boolean validarEntero(String entrada, String formato) {
		if (entrada.matches(formato)) {
			return true;
			
		}else {
			return false;
		}
		
		
	}
	
	public static int validarMenuInt(int entrada, int comparacion) {
		if(entrada <= comparacion){
			return entrada;
		}else {
			return 5;
		}
	}
	
	
	
}
