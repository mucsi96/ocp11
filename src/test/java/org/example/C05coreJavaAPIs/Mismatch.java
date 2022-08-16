package org.example.C05coreJavaAPIs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mismatch {
    @Test
    void test() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        // Returns:
        // the relative index of the first mismatch between the two arrays over the specified ranges, otherwise -1.
        assertEquals(-1, Arrays.mismatch(a, b));
    }
}
