package org.example.C06LamdasAndFunctionalInterfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EffectivelyFinalInLambda {
    @Test
    void test() {
        int a = 5;
        int b = 3;
        b = 4;
        List<Integer> c = new ArrayList<>();
        c.sort((x,y) -> a);
        // local variables referenced from a lambda expression must be final or effectively final
        // c.sort((x,y) -> b);
    }
}
