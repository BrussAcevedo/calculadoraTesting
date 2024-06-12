package cl.calculadora.calculadoraDesafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.calculadora.modelo.Operaciones;

public class OperacionesTest {

	public static Logger logger = Logger.getLogger("testing-unitario-desarrollo");

	@Test
	@DisplayName("Testeo método Restar")
	public void restarOperacion() {
		logger.info("Operación Restar");
		assertEquals(0, Operaciones.restar(5, 5), "Error en restar 5 - 5");
		assertEquals(-10, Operaciones.restar(15, 5), "Error en restar 15 - 5");
		assertEquals(10, Operaciones.restar(5, 15), "Error en restar 5 - 15");

	}

	@Test
	@DisplayName("Testeo método Sumar")
	public void sumarOperacion() {
		logger.info("Operación sumar");
		assertEquals(10, Operaciones.sumar(5, 5), "Error en sumar 5 + 5");
		assertEquals(20, Operaciones.sumar(15, 5), "Error en sumar 15 + 5");
		assertEquals(30, Operaciones.sumar(10, 20), "Error en sumar 10 + 20");

	}

	@Test
	@DisplayName("Testeo método Multiplicar")
	public void multiplicarOperacion() {
		logger.info("Operación sumar");
		assertEquals(25, Operaciones.multiplicar(5, 5), "Error en multiplicar 5 * 5");
		assertEquals(75, Operaciones.multiplicar(15, 5), "Error en multiplicar 15 * 5");
		assertEquals(200, Operaciones.multiplicar(10, 20), "Error en multiplicar 10 * 20");
	}

	@Test
	@DisplayName("Testeo método dividir")
	public void testDividir() {
		logger.info("Operación dividir");
		assertEquals(1, Operaciones.dividir(5, 5), "Error en dividir 5 / 5");
		assertEquals(0, Operaciones.dividir(15, 5), "Error en dividir 15 / 5");
		assertEquals(2, Operaciones.dividir(10, 20), "Error en dividir 10 / 20");
		 assertThrows(ArithmeticException.class, () -> Operaciones.dividir(0, 5), "No lanza ArithmeticException en dividir por 0");

	}

}
