package com.example.demo.n3.e4;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e4.ListManager;

public class ListManagerTest {

    @Test
    public void testListOrder() {
        ListManager listManager = new ListManager("String", 123, 45.67);

        // Verificar orden
        assertThat(listManager.isOrderCorrect("String", 123, 45.67)).isTrue();

        // Verificar cualquier orden
        assertThat(listManager.containsInAnyOrder(123, "String", 45.67)).isTrue();

        // Verificar unicidad
        assertThat(listManager.containsOnlyOnce("String")).isTrue();

        // Verificar ausencia
        assertThat(listManager.doesNotContain("NoPresente")).isTrue();
    }
}

