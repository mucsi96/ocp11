package org.example.C09advancedClassDesign;

import org.junit.jupiter.api.Test;

public class IllegalCombinationOfMethodModifiers {

    abstract class A {
        abstract int log();
    }

    abstract class B {
        // illegal combination of modifiers: abstract and static
        // static abstract int log();
    }

    abstract class C {
        // illegal combination of modifiers: abstract and private
        // private abstract int log();
    }

    @Test
    void test() {

    }
}
