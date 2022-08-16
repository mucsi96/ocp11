package org.example.C5coreJavaAPIs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Intern {
    @Test
    void test() {
        String a = "ab";
        String b = "a".concat("b");
        String c = b.intern(); // takes string from pool
        assertTrue(a == c);
    }
}
