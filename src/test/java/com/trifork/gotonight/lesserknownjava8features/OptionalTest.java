package com.trifork.gotonight.lesserknownjava8features;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalTest {

    @Test
    public void willGetValueWhenPresent() throws Exception {
        assertEquals("Hello", Optional.of("Hello").orElseThrow(() -> new RuntimeException("Wasn't present after all")));
    }

    @Test(expected = NoSuchElementException.class)
    public void willThrowWhenOptionalHasNoValue() throws Exception {
        Optional.empty().get();
    }

    @Test(expected = NullPointerException.class)
    public void instantationOfNullThrowsNullPointer() throws Exception {
        Optional.of(null);
    }

    @Test
    public void canFallBackIfValueIsEmpty() throws Exception {
        assertEquals("Hello", Optional.empty().orElse("Hello"));
    }

    @Test
    public void canCalculateDefault() throws Exception {
        assertEquals("hello", Optional.empty().orElseGet(() -> "HELLO".toLowerCase()));
    }
}
