package com.example.demo.n3.e6;

import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e6.ArrayAccessDemo;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayAccessDemoTest {

    @Test
    public void testExceptionOnInvalidIndex() {
        ArrayAccessDemo demo = new ArrayAccessDemo(new int[]{1, 2, 3});

        // Verificar que se lanza ArrayIndexOutOfBoundsException para un índice fuera de rango
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> demo.getElementAtIndex(5));
    }
}