package cl.calculadora.modelo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int resultado = 0;
		boolean estado = false;

		do {
			if (resultado == 0) {
				System.out.println("Ingresa el valor: ");
				String entrada2 = scan.nextLine();
				if (Utilidades.validarEntero(entrada2, "\\d+")) {
					resultado = Integer.parseInt(entrada2);
				}
			}
			System.out.println("(" + resultado + ")");
			System.out.println("1- Restar");
			System.out.println("2- Sumar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.println("5- Salir");
			System.out.println("Ingresa una opcion:");

			String tipoOperacion = scan.nextLine();

			if (Utilidades.validarEntero(tipoOperacion, "\\d+")) {
				int operacionInt = Integer.parseInt(tipoOperacion);

				if (operacionInt < 5) {
					System.out.println("Ingresa el siguiente valor: ");
					String entrada = scan.nextLine();
					
					int numEntrada = Integer.parseInt(entrada);
					num1 = numEntrada;
				}
					switch (operacionInt) {
					case 1: { // Restar
						resultado = Operaciones.restar(num1, resultado);
						System.out.println("El resultado de la resta es: " + resultado);
						break;
					}
					case 2: { // sumar
						resultado = Operaciones.sumar(num1, resultado);
						System.out.println("El resultado de la suma es: " + resultado);
						break;
					}
					case 3: { // Multiplicar
						resultado = Operaciones.multiplicar(num1, resultado);
						System.out.println("El resultado de la multiplicacion es: " + resultado);
						break;
					}
					case 4: { // Dividir
						resultado = Operaciones.dividir(num1, resultado);
						System.out.println("El resultado de la division es: " + resultado);
						break;
					}
					case 5: {
						System.out.println("Saliendo del programa...");
						estado = true;
						break;
					}

					default:
						throw new IllegalArgumentException("Unexpected value: " + operacionInt);
					}
				
			} else {
				System.out.println("Error: Debes ingresar un valor entero del 1 al 4.");
				break;
			}

			System.out.println("-------------------------------");

		} while (estado == false);
	}

}
