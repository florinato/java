package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;



public class ListTest {
    @Test
    public void testListOrder() {
        List<Object> myList = new ArrayList<>(Arrays.asList("String", 123, 45.67));

        // Verificar orden
        assertThat(myList).containsExactly("String", 123, 45.67);

        // Verificar cualquier orden
        assertThat(myList).containsExactlyInAnyOrder(123, "String", 45.67);

        // Verificar unicidad
        assertThat(myList).containsOnlyOnce("String");

        // Verificar ausencia
        assertThat(myList).doesNotContain("NoPresente");
    }
}


