package clases_indiv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {
    private int acumulado;

    @BeforeEach
    void setUp() {
        int acumulado = 0;
    }

    @AfterEach
    void tearDown() {

    }


    @Test
    void restaDosD() {
        // Resta de 2 numeros reales
        double x = 21.50;
        double y = 10.0;
        double resultadoEsperado = 11.50;
        double resultadoObtenido = x - y;
        assertEquals(resultadoObtenido, resultadoEsperado);
    }

    @Test
    void restaDosI() {
        // Resta de 2 numeros enteros
        int x = 50;
        int y = 20;
        int resultadoEsperado = 30;
        int resultadoObtenido = x - y;
        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    @Test
    void restaTresD() {
        // Resta de 3 numeros reales
        double x = 21.50;
        double y = 10.0;
        double c = 10.0;
        double resultadoEsperado = 1.50;
        double resultadoObtenido = x - y - c;
        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    @Test
    void acumuladorResta() {
        // Suma acumulando 1 numero entero pasado
        acumulado = 0;
        int x = 0;
        x = 10;
        int resultadoEsperado = 10;
        int resultadoObtenido = acumulado + x;
        assertEquals(resultadoObtenido, resultadoEsperado);


    }

}