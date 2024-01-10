package com.example.demo.n1.e1;

import org.junit.jupiter.api.Test;

import com.example.s1_04.n1.e1.MesesDelAno;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MesesDelAnoTest {

    @Test
    public void testTamanioListaMeses() {
        List<String> meses = MesesDelAno.obtenerMeses();
        assertEquals(12, meses.size());
    }

    @Test
    public void testListaMesesNoNula() {
        List<String> meses = MesesDelAno.obtenerMeses();
        assertNotNull(meses);
    }

    @Test
    public void testPosicionAgosto() {
        List<String> meses = MesesDelAno.obtenerMeses();
        assertEquals("agosto", meses.get(7)); // Recuerda, en Java las listas comienzan en 0
    }
    
}
