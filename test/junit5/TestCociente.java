package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import clases_indiv.Cociente;

public class TestCociente {
	private Cociente c1;
	

	@Test
	public void testCocEnterosTry() {
		System.out.println("Test 1: División de dos números enteros.");
		c1 = new Cociente();
		
		assertTrue(c1.cocEnterosTry(8, 4)==((int)8/4));
		assertTrue(c1.cocEnterosTry(9, 2)==((int)9/2));
	}
	
	/*
	@Test
	public void testCocEnterosTrycon0() {
		System.out.println("Test 2: División de dos números enteros y el segundo es 0. No levanta excepción.");
		c1 = new Cociente();
		
		assertThrows (
				ArithmeticException.class,
				() -> c1.cocEnterosTry(18, 0));
	}
	
	*/
	
	@Test
	public void testCocEnterosTry0() {
		System.out.println("Test 3: División de dos números enteros y el segundo es 0. Mensaje de error y 0. ");
		c1 = new Cociente();
		
		assertEquals(0, c1.cocEnterosTry(8 , 0));
	}
	
	@Test
	public static void testcocRealcon0 () throws Exception {
		System.out.println("Test 4: División de dos números reales y el segundo es 0.");
		
		assertThrows (
				Exception.class,
				() -> Cociente.cocReal(18.5, 0));
	}
	
	@Test
	public static void testcocReal () throws Exception {
		System.out.println("Test 5: División de dos números reales.");
		
		assertEquals((10.4/2.2), Cociente.cocReal(10.4, 2.2));
	}
	
	@Test
	public static void testinverso0 () throws Exception {
		System.out.println("Test 6: Inverso multiplicativo de 0.");
		
		assertThrows (
				Exception.class,
				() -> Cociente.inverso(0));
	}
	
	@Test
	public static void testinverso () throws Exception {
		System.out.println("Test 7: Inverso multiplicativo");
		
		assertEquals((1/5), Cociente.inverso(5));
	}
	
	@Test
	public static void testcalRaiz() throws Exception {
		System.out.println("Test 8: Inverso multiplicativo.");
		
		assertEquals(Math.sqrt(9), Cociente.calRaiz(9));
	}
	
	@Test
	public static void testcalRaiz0() throws Exception {
		System.out.println("Test 9: Inverso multiplicativo de 0.");
		
		assertEquals(Math.sqrt(0), Cociente.calRaiz(0));
	}
	
	@Test
	public static void testcalRaizNeg () throws Exception {
		System.out.println("Test 10: Inverso multiplicativo de número negativo.");
		
		assertThrows (
				Exception.class,
				() -> Cociente.calRaiz(-4));
	}
}
