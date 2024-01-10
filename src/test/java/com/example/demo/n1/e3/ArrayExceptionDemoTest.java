package com.example.demo.n1.e3;

import org.junit.jupiter.api.Test;

import com.example.s1_04.n1.e3.ArrayExceptionDemo;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionDemoTest {

    @Test
    public void testLanzarExcepcion() {
        ArrayExceptionDemo demo = new ArrayExceptionDemo();
        assertThrows(ArrayIndexOutOfBoundsException.class, demo::lanzarExcepcion);
    }
}
