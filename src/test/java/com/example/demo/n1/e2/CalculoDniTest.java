package com.example.demo.n1.e2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.example.s1_04.n1.e2.CalculoDni;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class CalculoDniTest {

    private static Stream<Object[]> datosDni() {
        return Stream.of(
            new Object[]{12345678, 'Z'},
            new Object[]{87654321, 'X'}
            // Más datos aquí
        );
    }
    

    @ParameterizedTest
    @MethodSource("datosDni")
    public void testCalcularLetraDni(int numeroDni, char letraEsperada) {
        assertEquals(letraEsperada, CalculoDni.calcularLetraDni(numeroDni));
    }
}

