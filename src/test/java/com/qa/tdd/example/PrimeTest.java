package com.qa.tdd.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PrimeTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verify_number_one() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(1);
        assertFalse(isPrime);
    }

    @Test
    public void verify_number_four() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(4);
        assertFalse(isPrime);
    }

    @Test
    public void verify_number_seven() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(7);
        assertTrue(isPrime);
    }

    @Test
    public void verify_number_twenty() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(20);
        assertFalse(isPrime);
    }

    @Test
    public void verify_number_thirtyOne() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(31);
        assertTrue(isPrime);
    }

    @Test
    public void verify_number_negative() {
        PrimeExercise primeExercise = new PrimeExercise();
        boolean isPrime = primeExercise.isPrime(-3);
        assertFalse(isPrime);
    }
}
