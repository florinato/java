package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionDemoTest {

    @Test
    public void testLanzarExcepcion() {
        ArrayExceptionDemo demo = new ArrayExceptionDemo();
        assertThrows(ArrayIndexOutOfBoundsException.class, demo::lanzarExcepcion);
    }
}
