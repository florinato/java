package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    public void testException() {
        assertThatThrownBy(() -> {
            int[] array = new int[5];
            // Accediendo directamente al índice del array
            int unused = array[10]; // Provocará la excepción
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
