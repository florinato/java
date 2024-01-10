package com.example.demo.n3.e2;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e2.ReferenceOperations;

public class ReferenceOperationsTest {

    private final ReferenceOperations operations = new ReferenceOperations();

    @Test
    public void testReference() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        // Aserción para la misma referencia
        assertThat(operations.isSameReference(obj1, obj2)).isTrue();

        // Aserción para referencia diferente
        assertThat(operations.isDifferentReference(obj1, obj3)).isTrue();
    }
}
