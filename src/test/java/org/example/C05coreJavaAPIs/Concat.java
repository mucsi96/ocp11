package org.example.C05coreJavaAPIs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Concat {
    @Test
    void test() {
        String a = "ab";
        String b = "a".concat("b"); // Returns new string reference
        assertTrue(a.equals(b));
        assertFalse(a == b);
    }
}
