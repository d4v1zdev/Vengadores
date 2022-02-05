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
		
		// LLAMADAS METODOS RESTA
		
		Resta r1 = new Resta();
		
		System.out.println("** RESTA DE TRES N�MEROS REALES");
		System.out.println("El resultado de la resta de 9,3 - 2,1 - 2,9 es: " + Math.floor(r1.restaTresD(9.3, 2.1, 2.9)));
		
		System.out.println("** RESTA DE DOS N�MEROS REALES");
		System.out.println("El resultado de la resta de 23,4 - 7,3 es: " + Math.floor(r1.restaDosD(23.4, 7.3)));
		
		System.out.println("** RESTA DE DOS N�MEROS ENTEROS");
		System.out.println("El resultado de la resta de 15 - 4  es: " + r1.restaDosI(15, 4));
		
		
		
		// LLAMADAS METODOS PRODUCTO
		
		// LLAMADAS METODOS COCIENTE
		
		Cociente c1 = new Cociente();
        System.out.println("La division de 2 numeros enteros es: " +c1.cocEnterosTry(6,4));
        System.out.println("** DIVISION NUMEROS REALES **");
        try {
            System.out.println("La division de 2 numeros REALES es.: " + c1.cocReal(7.34,0));
        }catch(Exception e) {
            System.out.println("No se permite la division por 0");
            System.out.println("El tipo de excepcion Java es: " + e.toString());
        }
        System.out.println("** CALCULO DEL INVERSO **");
        try {
            System.out.println("El numero inverso es.: " + c1.inverso(7.32));
        }catch(Exception e) {
            System.out.println("El numero 0 no tiene Inverso");
            System.out.println("El tipo de excepcion Java es: " + e.toString());
        }

        System.out.println("** CALCULO DE LA RAIZ DE UN NUMERO **");
        try {
            System.out.println("la raiz cuadrada es.: " + c1.calRaiz(-1));
        }catch(Exception e) {
            System.out.println("No es posible calcular la raiz de un numero negativo");
            System.out.println("El tipo de excepcion Java es: " + e.toString());
        }


	}

}
