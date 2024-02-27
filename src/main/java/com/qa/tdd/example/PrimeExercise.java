package com.qa.tdd.example;

/**
 * Hello world!
 *
 */
public class PrimeExercise {

    public boolean isPrime(int number) {

        if (number <= 1) {
            System.out.println("The number: " + number + " is not prime, it's a negative number");
            return false;
        } else {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    System.out.println("The number: " + number + " is not prime");
                    return false;
                }
            }
            System.out.println("The number: " + number + " is prime");
            return true;

        }
    }
}
