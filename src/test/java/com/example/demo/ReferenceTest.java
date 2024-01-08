package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReferenceTest {
    @Test
    public void testReference() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        // Aserción para la misma referencia
        assertThat(obj1).isSameAs(obj2);

        // Aserción para referencia diferente
        assertThat(obj1).isNotSameAs(obj3);
    }
}

