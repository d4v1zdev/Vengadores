package clases_indiv;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;



public class ProductoTest extends Producto {

	@Test
	public void Reales2_Rango_15_decimales() {
		Producto producto = new Producto();

		/*
		 * Metodo 1: Multiplicacion de dos numeros reales (double), haremos uso del
		 * método assertEquals, para las operaciones con este tipo de variables en
		 * especifico se usan tres parametros: el valor esperado, el actual, y el margen
		 * de error, en este caso al ser tan infimo valor, podemos poner que la
		 * diferencia sea de 0.
		 */

		double resultadoEsperado = (-401.77777777777777);
		double resultadoObtenido = producto.Producto2reales((-8), 50.222222222222222);
		double margenDeError = 0.0;

		// Se estima que el primer y el segundo parametro tengan el mismo valor.
		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido
	}

	@Test
	public void Reales2_Rango_MasDe_15Decimales() {
		Producto producto = new Producto();

		// Se estima que el metodo no acepte valores double con rango de mas de 15
		// decimales, y por lo tanto redonde el resultado actual, aunque el esperado
		// tenga menos decimales.

		double resultadoEsperado = (-401.77777777777777);
		double resultadoObtenido = producto.Producto2reales((-8), 50.222222222222222222222222222);
		double margenDeError = 0.0;

		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido

	}

	@Test
	public void Reales2_Valor0() {
		Producto producto = new Producto();

		// Se estima que el metodo acepte el valor 0, y que por lo tanto el resultado
		// actual yel esperado sea 0.0.

		double resultadoEsperado = 0.0;
		double resultadoObtenido = producto.Producto2reales(0, 50.222222222222222222222222222);
		double margenDeError = 0;

		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido

	}

	/*
	 * Metodo 2: Multiplicacion de dos numeros enteros (int), haremos uso de nuevo
	 * del metodo assertEquals, en este caso con dos parametros. Se probarán valores
	 * positivos, negativos y 0.
	 */

	@Test
	public void Enteros() {
		Producto producto = new Producto();

		int resultadoEsperado = 40;
		int resultadoObtenido = producto.Producto2enteros(8, 5);

		// Se estima que el primer y el segundo parametro tengan el mismo valor.
		assertEquals(resultadoEsperado, resultadoObtenido);
		// Coinciden, lo damos por valido

	}

	@Test
	public void EnterosNegativos() {
		Producto producto = new Producto();

		int resultadoEsperado = (-40);
		int resultadoObtenido = (producto.Producto2enteros(-8, 5));

		// Se estima que admita valores negativos y por lo tanto coincidan los
		// resultados.
		assertEquals(resultadoEsperado, resultadoObtenido);
		// Coinciden, lo damos por valido

	}

	@Test
	public void Enteros_0() {
		Producto producto = new Producto();

		int resultadoEsperado = (0);
		int resultadoObtenido = (producto.Producto2enteros(0, 5));

		// Se estima que admita el valor 0 y por lo tanto coincidan los resultados.
		assertEquals(resultadoEsperado, resultadoObtenido);
		// Coinciden, lo damos por valido

	}

	/*
	 * Metodo 3: Multiplicacion de tres numeros reales (double). Se probarán valores
	 * positivos, negativos y 0.
	 */

	@Test
	public void Reales3_Rango_15_decimales() {
		Producto producto = new Producto();

		double resultadoEsperado = (-1557.3333333333333);
		double resultadoObtenido = producto.Producto3reales(40.555555555555555, -8, 4.8);
		double margenDeError = 0.0;

		// Se estima que el primer y el segundo parametro tengan el mismo valor.
		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido
	}

	@Test
	public void Reales3_Rango_MasDe_15Decimales() {
		Producto producto = new Producto();

		// Se estima que el metodo no acepte valores double con rango de mas de 15
		// decimales, y por lo tanto redonde el resultado actual, aunque el esperado
		// tenga menos decimales.

		double resultadoEsperado = (-1557.3333333333333);
		double resultadoObtenido = producto.Producto3reales(40.5555555555555555555555555555, -8, 4.8);
		double margenDeError = 0.0;

		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido

	}

	@Test
	public void Reales3_Valor0() {
		Producto producto = new Producto();

		// Se estima que el metodo acepte el valor 0, y que por lo tanto el resultado
		// actual yel esperado sea 0.0.

		double resultadoEsperado = 0.0;
		double resultadoObtenido = producto.Producto3reales(40.5, -8, 0);
		double margenDeError = 0;

		assertEquals(resultadoEsperado, resultadoObtenido, margenDeError);
		// Coinciden, lo damos por valido

	}

	/*
	 * Metodo 4: Calcula la potencia de un numero entero. Se probarán valores
	 * positivos, negativos y 0.
	 */

	@Test
	public void Potencia() {
		Producto producto = new Producto();

		int resultadoEsperado = 27;
		int resultadoObtenido = producto.Potencia(3, 3);

		assertEquals(resultadoEsperado, resultadoObtenido);
		// Coinciden, lo damos por valido

	}
}