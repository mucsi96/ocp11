package org.example.C2javaBuildingBlocks;

import org.junit.jupiter.api.Test;

public class UnderscoreNextToDecimalPoint {
    @Test
    void test() {
        float a = 1_1.0f;
        // illegal underscore
        // float b = 11_.0f;
    }
}
