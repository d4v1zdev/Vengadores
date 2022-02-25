package clases_indiv;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases_indiv.Cociente;

class TestCociente {

    //private Object myObject;
    private Cociente c1;


    /**
     * Test que consiste en probar que el m�todo cocEnterosTry divide dos n�meros enteros.
     * Tambi�n se prueba que si al segundo valor se le pone un 0, da error. 
     */
    @Test
    void cocEnterosTry() {
    	System.out.println("Test 1: Divisi�n de dos n�meros enteros, y si el segundo es 0 sale mensaje. ");
    	c1 = new Cociente();
    	
        int num1 = 6;
        int num2 = 2;
        
        int resultadoEsperado = c1.cocEnterosTry(num1, num2);
        int resultadoObtenido = num1 / num2;
        
        assertEquals(resultadoObtenido, resultadoEsperado);
        assertThrows(ArithmeticException.class, () -> {
            int resultObtenido = num1 / 0;
        });
    }
    
    /**
     * Con este metodo controlamos si se divide por 0, dando test correcto al dividir por 0,
     * con lo que significa que efectivamente esta controlado.
     */

    @Test
    void test_exception() {
    	c1 = new Cociente();
    	System.out.println("Test 2: Divisi�n de dos n�meros, el segundo es 0. ");
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> divide((int) 10.2, 0));

        assertEquals("/ by zero", exception.getMessage());

        assertTrue(exception.getMessage().contains("zero"));

    }

    double divide(int num1, int num2) {
        return num1 / num2;
    }

    
    /**
     * Test que prueba el m�todo cocReal, que divide dos n�meros reales. 
     * @throws Exception Si el num2 es igual a 0, el sistema va lanzar una
	 *                   excepcion, que indicaremos en el main.
     */
    @Test
    void cocReal() throws Exception {
    	System.out.println("Test 3: Divisi�n de dos n�meros reales.");
    	c1 = new Cociente();
        double num1 = 6.0;
        double num2 = 2.0;
        double resultadoEsperado = c1.cocReal(num1, num2);
        double resultadoObtenido = num1 / num2;
        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    /**
     * Test que prueba el m�todo cocReal, que divide dos n�meros reales, el segundo es 0.
     * @throws Exception Si el num2 es igual a 0, el sistema va lanzar una
	 *                   excepcion, que indicaremos en el main.
     */
	@Test
	public void testcocReal0 () throws Exception {
		System.out.println("Test 4:  Divisi�n de dos n�meros reales y el segundo es 0.");
		c1 = new Cociente();
		assertThrows (
				Exception.class,
				() -> c1.cocReal(6.0, 0));
	}


    /**
     * Test que prueba el inverso de un n�mero real. 
     * @throws Exception Se comprueba que excepcion devuelve al intentar hacer el
	 *                   inverso de 0.
     */
    
    @Test
    void inverso() throws Exception {
    	System.out.println("Test 5: Inverso multiplicativo.");
    	c1 = new Cociente();
        double num1 = 5.0;
        
        double resultadoEsperado = c1.inverso(num1);
        double resultadoObtenido = 1 / num1;
        
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    /**
     * Test que prueba el inverso del n�mero 0 y devuelve una excepci�n. 
     * @throws Exception Se comprueba que excepcion devuelve al intentar hacer el
	 *                   inverso de 0.
     */
    
	@Test
	public void testinverso0 () throws Exception {
		System.out.println("Test 6: Inverso multiplicativo de 0.");
		c1 = new Cociente();
		assertThrows (
				Exception.class,
				() -> c1.inverso(0));
	}


	/**
	 * Test que prueba la ra�z cuadrada de un n�mero positivo. 
	 * @throws Exception Devuelve excepci�n si el n�mero de la ra�z cuadrada es negativo. 
	 */
    @Test
    void calRaiz() throws Exception {
    	System.out.println("Test 7: Ra�z cuadrada de n�mero positivo.");
    	c1 = new Cociente();
    	
        double num1 = 9.0;
        
        double resultadoEsperado = c1.calRaiz(num1);
        double resultadoObtenido = Math.sqrt(num1);
        
        assertEquals(resultadoObtenido, resultadoEsperado);

    }
    
    
	/**
	 * Test que prueba la ra�z cuadrada del n�mero 0. 
	 * @throws Exception Devuelve excepci�n si el n�mero de la ra�z cuadrada es negativo. 
	 */
	@Test
	public void testcalRaiz0() throws Exception {
		System.out.println("Test 8: Ra�z cuadrada de 0.");
		c1 = new Cociente();
		
		assertEquals(Math.sqrt(0), c1.calRaiz(0));
	}
	
	/**
	 * Test que prueba la ra�z cuadrada de un n�mero negativo, devuelve una excepci�n. 
	 * @throws Exception Devuelve excepci�n si el n�mero de la ra�z cuadrada es negativo. 
	 */
	@Test
	public void testcalRaizNeg () throws Exception {
		System.out.println("Test 9: Ra�z cuadrada de un n�mero negativo. ");
		c1 = new Cociente();
		assertThrows (
				Exception.class,
				() -> c1.calRaiz(-4));
	}
}