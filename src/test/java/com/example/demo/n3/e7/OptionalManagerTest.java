package com.example.demo.n3.e7;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.example.s1_04.n3.e7.OptionalManager;

public class OptionalManagerTest {

    @Test
    public void testOptionalEmpty() {
        OptionalManager manager = new OptionalManager();
        Optional<Object> emptyOptional = manager.createEmptyOptional();

        // Verificar que está vacío
        assertThat(emptyOptional).isEmpty();
    }
}
