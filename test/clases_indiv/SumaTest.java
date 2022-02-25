package clases_indiv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    private int acumulado;

    @BeforeEach
    void setUp() {
        int acumulado = 0;
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void SumaDosD() {
        // Suma de 2 numeros reales
        double x = 15.50;
        double y = 12.55;
        double resultadoEsperado = 28.05;
        double resultadoObtenido = x + y;
        assertEquals(resultadoObtenido, resultadoEsperado);
    }

    @Test
    void SumaDosI() {
        // Suma de 2 numeros enteros
        int x = 35;
        int y = 45;
        int resultadoEsperado = 80;
        int resultadoObtenido = x + y;
        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    @Test
    void SumaTresD() {
        // Suma de 3 numeros reales
        double x = 21.50;
        double y = 10.0;
        double c = 10.0;
        double resultadoEsperado = 41.50;
        double resultadoObtenido = x + y + c;
        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    @Test
    void acumuladorSuma() {
        // Suma acumulando 1 numero entero pasado
        acumulado = 0;
        int x = 0;
        x = 10;
        int resultadoEsperado = 10;
        int resultadoObtenido = acumulado + x;
        assertEquals(resultadoObtenido, resultadoEsperado);


    }

}