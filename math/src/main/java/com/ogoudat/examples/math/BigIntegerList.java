package com.ogoudat.examples.math;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BigIntegerList {
    private BigIntegerList() {
    }

    public static List<BigInteger> of(String... values) {
        return Arrays.stream(values)
                .map(BigInteger::new)
                .collect(Collectors.toUnmodifiableList());
    }

    public static List<BigInteger> of(long... values) {
        return Arrays.stream(values)
                .mapToObj(BigInteger::valueOf)
                .collect(Collectors.toUnmodifiableList());
    }
}
