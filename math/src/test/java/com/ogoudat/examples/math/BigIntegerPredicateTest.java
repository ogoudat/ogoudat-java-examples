package com.ogoudat.examples.math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BigIntegerPredicateTest {
    @Test
    void testIsEvenWithEvenNumber() {
        assertThat(BigIntegerPredicate.isEven().test(BigInteger.ZERO), is(equalTo(true)));
    }

    @Test
    void testIsEvenWithOddNumber() {
        assertThat(BigIntegerPredicate.isEven().test(BigInteger.ONE), is(equalTo(false)));
    }

    @Test
    void testIsOddWithEvenNumber() {
        assertThat(BigIntegerPredicate.isOdd().test(BigInteger.ZERO), is(equalTo(false)));
    }

    @Test
    void testIsOddWithOddNumber() {
        assertThat(BigIntegerPredicate.isOdd().test(BigInteger.ONE), is(equalTo(true)));
    }
}