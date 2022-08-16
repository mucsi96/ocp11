package org.example.C06LamdasAndFunctionalInterfaces;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthoboxingWithPredicates {

    boolean check(Predicate<Integer> p) {
        return p.test(5);
    }

    @Test
    void test() {
        assertTrue(check(i -> i == 5));
        assertTrue(check((i) -> i == 5));
        assertTrue(check(i -> {return i == 5;}));
        assertTrue(check((i) -> {return i == 5;}));
        // Incompatible parameter types in lambda expression: expected Integer but found int
        // assertTrue(check((int i) -> {return i == 5;}));
    }
}
