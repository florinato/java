package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {
    @Test
    public void testOptionalEmpty() {
        Optional<Object> emptyOptional = Optional.empty();

        // Verificar que está vacío
        assertThat(emptyOptional).isEmpty();
    }
}

