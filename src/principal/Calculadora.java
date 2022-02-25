package principal;

import clases_indiv.*;

/*
 * Clase principal Calculadora
 */
public class Calculadora {
	/*
	 * Realizamos las llamdas a los metodos de cada clase
	 */
	public static void main(String[] args) {

		// LLAMADAS METODOS SUMA

		Suma c = new Suma();

		System.out.println("Suma de dos numeros reales");
		c.sumaReales(23, 99);
		c.sumaReales(77, 01);
		System.out.println(c.getResultado());
		
		
		// LLAMADAS METODOS RESTA

		Resta r1 = new Resta();

		System.out.println("** RESTA DE TRES NÚMEROS REALES");
		System.out
				.println("El resultado de la resta de 9,3 - 2,1 - 2,9 es: " + Math.floor(r1.restaTresD(9.3, 2.1, 2.9)));

		System.out.println("** RESTA DE DOS NÚMEROS REALES");
		System.out.println("El resultado de la resta de 23,4 - 7,3 es: " + Math.floor(r1.restaDosD(23.4, 7.3)));

		System.out.println("** RESTA DE DOS NÚMEROS ENTEROS");
		System.out.println("El resultado de la resta de 15 - 4  es: " + r1.restaDosI(15, 4));

		// LLAMADAS METODOS PRODUCTO
		Producto operacion1 = new Producto();

		// llamamos al metodo Producto2enteros
		System.out.println("El resultado es " + operacion1.Producto2enteros(3, 6));

		// llamamos al metodo Producto2reales
		System.out.println("El resultado es " + operacion1.Producto2reales(2.3, -34));

		// llamamos al metodo Producto3reales
		System.out.println("El resultado es " + operacion1.Producto3reales(2.1, -6, 25));

		// llamamos al metodo Potencia
		System.out.println("El resultado es " + operacion1.Potencia(4, 5));



		// LLAMADAS METODOS COCIENTE

		Cociente c1 = new Cociente();
		System.out.println("La division de 2 numeros enteros es: " + c1.cocEnterosTry(6, 4));
		System.out.println("** DIVISION NUMEROS REALES **");
		try {
			System.out.println("La division de 2 numeros REALES es.: " + c1.cocReal(7.34, 0));
		} catch (Exception e) {
			System.out.println("No se permite la division por 0");
			System.out.println("El tipo de excepcion Java es: " + e.toString());
		}
		System.out.println("** CALCULO DEL INVERSO **");
		try {
			System.out.println("El numero inverso es.: " + c1.inverso(7.32));
		} catch (Exception e) {
			System.out.println("El numero 0 no tiene Inverso");
			System.out.println("El tipo de excepcion Java es: " + e.toString());
		}

		System.out.println("** CALCULO DE LA RAIZ DE UN NUMERO **");
		try {
			System.out.println("la raiz cuadrada es.: " + c1.calRaiz(-1));
		} catch (Exception e) {
			System.out.println("No es posible calcular la raiz de un numero negativo");
			System.out.println("El tipo de excepcion Java es: " + e.toString());
		}
	}
}
