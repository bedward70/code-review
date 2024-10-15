package org.example;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Function<String, Integer> toInteger = str -> Integer.valueOf(str);

    @Test
    public void testPositive() {
        assertEquals(0, toInteger.apply("0"));
        assertEquals(1, toInteger.apply("1"));
        assertEquals(2, toInteger.apply("2"));
        assertEquals(3, toInteger.apply("3"));
        assertEquals(4, toInteger.apply("4"));
        assertEquals(5, toInteger.apply("5"));
        assertEquals(6, toInteger.apply("6"));
        assertEquals(7, toInteger.apply("7"));
        assertEquals(8, toInteger.apply("8"));
        assertEquals(9, toInteger.apply("9"));
    }

    @Test
    public void testNegative() {
        assertEquals(0, toInteger.apply("-0"));
        assertEquals(-1, toInteger.apply("-1"));
        assertEquals(-2, toInteger.apply("-2"));
        assertEquals(-3, toInteger.apply("-3"));
        assertEquals(-4, toInteger.apply("-4"));
        assertEquals(-5, toInteger.apply("-5"));
        assertEquals(-6, toInteger.apply("-6"));
        assertEquals(-7, toInteger.apply("-7"));
        assertEquals(-8, toInteger.apply("-8"));
        assertEquals(-9, toInteger.apply("-9"));
    }
}
