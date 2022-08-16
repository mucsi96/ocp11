package org.example.C9advancedClassDesign;

import org.junit.jupiter.api.Test;

interface A {
    void log();
}

public class ImplementInterface implements A {

//    'log()' in 'org.example.advancedClassDesign.Main1' clashes with 'log()' in 'org.example.advancedClassDesign.A'; attempting to assign weaker access privileges ('protected'); was 'public'
//    protected void log() {
//
//    }

    public void log() {

    }

    @Test
    void test() {

    }
}