package org.example.C10Exceptions;

import org.junit.jupiter.api.Test;

public class TryWithResources {

    class A {

    }

    @Test
    void test() {
        // incompatible types: try-with-resources not applicable to variable type
        //    (org.example.C10Exceptions.TryWithResources1.A cannot be converted to java.lang.AutoCloseable)
//        try(A a = new A();) {
//
//        }
    }
}
