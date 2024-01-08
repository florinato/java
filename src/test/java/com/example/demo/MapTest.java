package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapTest {
    @Test
    public void testMapContainsKey() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("key1", 1);

        // Verificar clave presente
        assertThat(myMap).containsKey("key1");
    }
}

