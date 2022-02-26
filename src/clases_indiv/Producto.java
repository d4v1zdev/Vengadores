
package clases_indiv;


/**
 * Clase que contiene los metodos para calcular el producto de 2 o 3 enteros,
 * dos reales o elevar un numero a otro.
 * 
 * @author Anni
 * @version 1.0
 * 
 */
public class Producto {

	/**
	 * Declaramos la variable total, comun a todos los metodos para resultado entero
	 * y para real.
	 */
	int totalE;
	double totalR;
	float totalF;

	/**
	 * 
	 * Metodo 1: Multiplica dos numeros reales <b>(double)</b>, tendra 2 parametros
	 * de entrada <b>(real1,real2)</b> y uno de salida que sera <b>resultado</b>
	 * (suma de los valores). El orden en el que los valores se introducen no altera
	 * el resultado. <b>Rango aproximado de 15 cifras decimales</b>.
	 * 
	 * @param real1 primer factor o valor.
	 * @param real2 segundo factor o valor.
	 * @return totalR devuelve el resultado o producto de la multiplicacion de los
	 *         <b>dos numeros reales</b>, que sera un real.
	 */
	public double Producto2reales(double real1, double real2) {
		double totalR = 1;
		totalR = real1 * real2;
		return totalR;
	}

	/**
	 * 
	 * Metodo 2: Multiplica dos numeros enteros <b>(int)</b>, tendra 2 parametros de
	 * entrada <b>(entero1,entero2)</b> y uno de salida que sera <b>resultado</b>
	 * (multiplicacion de los valores). El orden en el que los valores se introducen
	 * no altera el resultado. Rango de la variable <b>int</b>: <b>-2.147.483.648 a
	 * 2.147.483.647</b>.
	 * 
	 * @param entero1 primer factor o valor.
	 * @param entero2 segundo factor o valor.
	 * @return totalE Devuelve el resultado de multiplicar <b>dos n�meros
	 *         enteros</b>, que ser� un entero.
	 * 
	 */
	public int Producto2enteros(int entero1, int entero2) {
		int totalE = 1;
		totalE = entero1 * entero2;
		return totalE;
	}

	/**
	 * 
	 * Metodo 3: Multiplica tres numeros reales <b>(double)</b>, tendra 3 parametros
	 * de entrada <b>(real1,real2,real3)</b> y uno de salida que sera
	 * <b>resultado</b> (multiplicacion de los valores). El orden en el que los
	 * valores se introducen no altera el resultado. <b>Rango aproximado de 15
	 * cifras decimales</b>.
	 * 
	 * @param real1 primer factor o valor.
	 * @param real2 segundo factor o valor.
	 * @param real3 tercer factor o valor.
	 * @return totalR Devuelve el resultado de multiplicar <b>tres numeros
	 *         reales</b>, que sera un real
	 * 
	 */
	public double Producto3reales(double real1, double real2, double real3) {
		double totalR = 1;
		totalR = real1 * real2 * real3;
		return totalR;
	}

	/**
	 * 
	 * Metodo 4: Calcula la <b>potencia</b> de un numero entero <b>(int)</b>, teniendo como parametros
	 * de entrada <b>(base,exponente)</b>. Rango de la variable <b>int</b>: <b>-2.147.483.648 a
	 * 2.147.483.647</b>.
	 * 
	 * @param base debe ser entero.
	 * @param exponente numero de veces que la base se multiplica por si misma (debe ser entero).
	 * @return totalE Devuelve el resultado de multiplicar la base por si misma el
	 *         numero de veces que el exponente determine.
	 */
	public int Potencia(int base, int exponente) {
        int totalE = 1;
        totalE = (int) Math.pow(exponente, base);
        return totalE;

}
