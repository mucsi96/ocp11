package org.example.C05coreJavaAPIs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListOf {
    @Test
    void test() {
        // a is ImmutableCollections$AbstractImmutableList
        List a = List.of(1, 2);

        // java.lang.UnsupportedOperationException ImmutableCollections$AbstractImmutableList.sort
        assertThrows(UnsupportedOperationException.class, () -> a.sort((x, y) -> (int)y - (int)x));
    }
}
