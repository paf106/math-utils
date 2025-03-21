package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathUtilTest {

    @Test
    public void testPrimeNumberIsTrue() {
        assertTrue(MathUtil.isPrime(5));
        assertTrue(MathUtil.isPrime(7));
        assertTrue(MathUtil.isPrime(11));
    }

    @Test
    public void testPrimeNumberIsFalse() {
        assertFalse(MathUtil.isPrime(1));
        assertFalse(MathUtil.isPrime(6));
        assertFalse(MathUtil.isPrime(15));
    }

    @Test
    public void testEvenNumberIsTrue() {
        assertTrue(MathUtil.isEven(2));
        assertTrue(MathUtil.isEven(4));
        assertTrue(MathUtil.isEven(6));
    }

    @Test
    public void testEvenNumberIsFalse() {
        assertFalse(MathUtil.isEven(1));
        assertFalse(MathUtil.isEven(3));
        assertFalse(MathUtil.isEven(5));
    }

    @Test
    public void testOddNumberIsTrue() {
        assertTrue(MathUtil.isOdd(1));
        assertTrue(MathUtil.isOdd(3));
        assertTrue(MathUtil.isOdd(5));
    }

    @Test
    public void testOddNumberIsFalse() {
        assertFalse(MathUtil.isOdd(2));
        assertFalse(MathUtil.isOdd(4));
        assertFalse(MathUtil.isOdd(6));
    }
}
