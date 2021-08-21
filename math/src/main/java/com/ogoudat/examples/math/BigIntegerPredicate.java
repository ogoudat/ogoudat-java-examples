package com.ogoudat.examples.math;

import java.math.BigInteger;
import java.util.function.Predicate;

public class BigIntegerPredicate {
    private BigIntegerPredicate() {
    }

    public static Predicate<BigInteger> isEven() {
        return value -> !value.testBit(0);
    }

    public static Predicate<BigInteger> isOdd() {
        return value -> value.testBit(0);
    }
}
