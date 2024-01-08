package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringLengthTest {

    @Test
    public void testStringLength() {
        assertThat("Mordor", new StringLengthMatcher(is(6)));
    }
}

