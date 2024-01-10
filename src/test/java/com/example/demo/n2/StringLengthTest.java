package com.example.demo.n2;

import org.junit.jupiter.api.Test;

import com.example.s1_04.n2.StringLengthMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringLengthTest {

    @Test
    public void testStringLength() {
        assertThat("Mordor", new StringLengthMatcher(is(6)));
    }
}

