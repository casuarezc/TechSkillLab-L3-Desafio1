package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] enteros;
    double[] decimales;

    @BeforeEach
    void setUp() {
        enteros = new int[]{20, 2, 2};
        decimales = new double[]{4.0, 2.0, 2.0};
    }

    @Test
    void dividirEnterosExitoso() {
        Assertions.assertEquals(5, Calculadora.dividir(enteros));
    }

    @Test
    void testDividirDecimalesExitoso() {
        Assertions.assertEquals(1.0, Calculadora.dividir(decimales));
    }

    @Test
    void dividirErrorXCero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(4, 0);
        });
    }
}