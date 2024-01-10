package com.example.demo.n3.e3;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e3.ArrayOperations;

public class ArrayOperationsTest {

    private final ArrayOperations operations = new ArrayOperations();

    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Aserción para arrays idénticos
        assertThat(operations.areArraysEqual(array1, array2)).isTrue();
    }
}
