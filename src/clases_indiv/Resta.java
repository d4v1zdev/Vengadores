package clases_indiv;


/**
 * Clase que <b>calcula la resta</b> de varios números dependiendo de la cantidad de parámetros que se usen y el tipo de variable.
 * 
 * 
 * @author Lierni
 *
 */
public class Resta {
	
	/**
	 * Método que calcula la resta de <b>dos números reales</b>. 
	 * 
	 * @param x Representa un número real al que restaríamos un valor. 
	 * @param y Representa un número real que restaría al parámetro x. 
	 * @return Devuelve el valor de la resta de los parámetros intriducidos. 
	 */
	public double restaDosD (double x, double y) {
		return x - y;
	}
	
	/**
	 * Método que calcula la resta de <b>dos números enteros</b>.
	 * 
	 * @param x Representa un número entero al que restar un valor. 
	 * @param y Representa un número entero que restaría al valor introducido. 
	 * @return Devuelve el valor de la resta de los parámetros intriducidos.
	 */
	public double restaDosI (int x, int y) {
		return x - y;
	}
	
	/**
	 * Método que calcula la resta de <b>dos números enteros</b>.
	 * 
	 * @param x Representa un número real al que restar un valor. 
	 * @param y Representa un número real que restaría al valor introducido. 
	 * @param c Representa un número real que restaría a los valores anteriormente introducidos. 
	 * @return Devuelve el valor de la resta de los parámetros intriducidos.
	 */
	public double restaTresD (double x, double y, double c) {
		return x - y - c;
	}
	
	/**
	 * Método que <b>acumula las restas</b> que se han ido creando. 
	 * @param x Representa un número entero que irá restando al valor anterior. 
	 */
	public void acumuladorResta (int x) {
		int acumulado = 0;
		acumulado = acumulado - x;
	}
}