package org.example.C03Operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CancelingPostIncrement {
    @Test
    void test() {
        int a = 1;
        a = a++;
        assertEquals(1, a);
    }
}
