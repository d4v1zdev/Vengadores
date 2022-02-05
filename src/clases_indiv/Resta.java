package clases_indiv;


/**
 * Clase que <b>calcula la resta</b> de varios n�meros dependiendo de la cantidad de par�metros que se usen y el tipo de variable.
 * 
 * 
 * @author Lierni
 *
 */
public class Resta {
	
	/**
	 * M�todo que calcula la resta de <b>dos n�meros reales</b>. 
	 * 
	 * @param x Representa un n�mero real al que restar�amos un valor. 
	 * @param y Representa un n�mero real que restar�a al par�metro x. 
	 * @return Devuelve el valor de la resta de los par�metros intriducidos. 
	 */
	public double restaDosD (double x, double y) {
		return x - y;
	}
	
	/**
	 * M�todo que calcula la resta de <b>dos n�meros enteros</b>.
	 * 
	 * @param x Representa un n�mero entero al que restar un valor. 
	 * @param y Representa un n�mero entero que restar�a al valor introducido. 
	 * @return Devuelve el valor de la resta de los par�metros intriducidos.
	 */
	public double restaDosI (int x, int y) {
		return x - y;
	}
	
	/**
	 * M�todo que calcula la resta de <b>dos n�meros enteros</b>.
	 * 
	 * @param x Representa un n�mero real al que restar un valor. 
	 * @param y Representa un n�mero real que restar�a al valor introducido. 
	 * @param c Representa un n�mero real que restar�a a los valores anteriormente introducidos. 
	 * @return Devuelve el valor de la resta de los par�metros intriducidos.
	 */
	public double restaTresD (double x, double y, double c) {
		return x - y - c;
	}
	
	/**
	 * M�todo que <b>acumula las restas</b> que se han ido creando. 
	 * @param x Representa un n�mero entero que ir� restando al valor anterior. 
	 */
	public void acumuladorResta (int x) {
		int acumulado = 0;
		acumulado = acumulado - x;
	}
}