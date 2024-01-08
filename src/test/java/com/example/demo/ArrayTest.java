package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Aserción para arrays idénticos
        assertThat(array1).isEqualTo(array2);
    }
}

