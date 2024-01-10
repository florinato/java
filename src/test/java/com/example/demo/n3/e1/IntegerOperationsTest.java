package com.example.demo.n3.e1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e1.IntegerOperations;

public class IntegerOperationsTest {

    private final IntegerOperations operations = new IntegerOperations();

    @Test
    public void testEquality() {
        Integer number1 = 5;
        Integer number2 = 5;
        Integer number3 = 7;

        // Aserción para igualdad
        assertThat(operations.isEqual(number1, number2)).isTrue();

        // Aserción para desigualdad
        assertThat(operations.isNotEqual(number1, number3)).isTrue();
    }
}
