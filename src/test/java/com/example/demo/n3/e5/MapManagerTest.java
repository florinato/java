package com.example.demo.n3.e5;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e5.MapManager;

public class MapManagerTest {

    @Test
    public void testMapContainsKey() {
        MapManager mapManager = new MapManager();
        mapManager.put("key1", 1);

        // Verificar clave presente
        assertThat(mapManager.containsKey("key1")).isTrue();
    }
}
