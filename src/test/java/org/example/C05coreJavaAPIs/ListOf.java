package org.example.C05coreJavaAPIs;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ListOf {
    @Test
    void test() {
        // a is ImmutableCollections$AbstractImmutableList
        List a = List.of(1, 2);

        // java.lang.UnsupportedOperationException ImmutableCollections$AbstractImmutableList.sort
        a.sort((x, y) -> (int)y - (int)x);
    }
}
