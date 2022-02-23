package clases_indev;

public class Suma {

	/**
	 * Declaracion de la clase <b>Suma</b>, operacion aritmetica que consiste en
	 * reunir varias cantidades en una sola; se representa con el signo <b>+</b>.
	 * 
	 * @author simon
	 * @version 1.0
	 */

	private int resultado;

	/**
	 * Metodo 1: Suma de dos numeros reales <b>(double)</b>, tendra 2 parametros de
	 * entrada <b>(num1,num2)</b> y uno de salida que sera <b>resultado</b> (suma de
	 * los valores). El orden en el que los valores se introducen no altera el
	 * resultado. <b>Rango aproximado de 15 cifras decimales</b>.
	 * 
	 * @param num1 primer sumando o valor.
	 * @param num2 segundo sumando o valor.
	 * @return <b>Resultado</b>: Valor de la <b>suma</b> de los valores <b>num1</b>
	 *         y <b>num2</b>.
	 */
	public double sumaReales(double num1, double num2) {

		double resultado = (num1 + num2);
		return resultado;
	}

	/**
	 * Metodo 2: Suma de dos numeros enteros <b>(int)</b>, tendra 2 parametros de
	 * entrada <b>(num1,num2)</b> y uno de salida que sera <b>resultado</b> (suma de
	 * los valores). El orden en el que los valores se introducen no altera el
	 * resultado. Rango de la variable <b>int</b>: <b>-2.147.483.648 a
	 * 2.147.483.647</b>.
	 * 
	 * @param num1 primer sumando o valor.
	 * @param num2 segundo sumando o valor.
	 * @return <b>Resultado</b>: Valor de la <b>suma</b> de los valores <b>num1</b>
	 *         y <b>num2</b>.
	 */
	public int sumaEnt(int num1, int num2) {

		int resultado = (num1 + num2);
		return resultado;
	}

	/**
	 * Metodo 3: Suma de tres numeros reales <b>(double)</b>, tendra 3 parametros de
	 * entrada <b>(num1,num2,num3)</b> y uno de salida que sera <b>resultado</b>
	 * (suma de los valores). El orden en el que los valores se introducen no altera
	 * el resultado. <b>Rango aproximado de 15 cifras decimales</b>.
	 * 
	 * @param num1 primer sumando o valor.
	 * @param num2 segundo sumando o valor.
	 * @param num3 tercer sumando o valor.
	 * @return <b>Resultado</b>: Valor de la <b>suma</b> de los valores <b>num1</b>,
	 *         <b>num2</b> y <b>num3</b>.
	 */
	public double sumaRealesTrio(double num1, double num2, double num3) {
		double resultado = (num1 + num2 + num3);
		return resultado;
	}

	/**
	 * Metodo 4: Suma de numeros enteros <b>(int)</b> con valor acumulado, tendra un
	 * parametro de entrada y la clase debera de guardar el valor acumulado. Rango
	 * de la variable <b>int</b>: <b>-2.147.483.648 a 2.147.483.647</b>.
	 * 
	 * @param num sumando o valor que ira añadiendose al valor <b>resultado</b>.
	 * @return <b>Resultado</b>: Valor acumulado que sera la suma total de los
	 *         valores <b>resultado</b> y <b>num</b>.
	 * @throws Exception Si el valor supera el rango permitido
	 *                   (<b>-2.147.483.648/2.147.483.647</b>), generaria una
	 *                   excepcion de tipo <b>java.lang.exception</b>.
	 */
	public int sumaAcumulada(int num) {
		resultado = resultado + num;
		return resultado;

	}

	public String getResultado() {
		return "La suma total es: " + resultado;

	}

}
