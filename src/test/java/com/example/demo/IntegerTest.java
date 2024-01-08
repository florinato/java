package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IntegerTest {
    @Test
    public void testEquality() {
        Integer number1 = 5;
        Integer number2 = 5;
        Integer number3 = 7;

        // Aserción para igualdad
        assertThat(number1).isEqualTo(number2);

        // Aserción para desigualdad
        assertThat(number1).isNotEqualTo(number3);
    }
}

