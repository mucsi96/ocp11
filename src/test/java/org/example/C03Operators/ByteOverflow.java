package org.example.C03Operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteOverflow {
    @Test
    void test() {
        assertEquals(-128, (byte)(Byte.MAX_VALUE + 1));
    }
}
