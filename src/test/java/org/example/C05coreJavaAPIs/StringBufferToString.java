package org.example.C05coreJavaAPIs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringBufferToString {
    @Test
    void test() {
        String a = "ab";
        String b = new StringBuffer().append("a").append("b").toString(); // Returns new string reference
        assertFalse(a == b);
    }
}
