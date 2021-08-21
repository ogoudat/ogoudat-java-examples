package com.ogoudat.examples.math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class BigIntegerListTest {
    @Test
    void testCreateListFromTwoStrings() {
        List<BigInteger> bigIntegers = BigIntegerList.of("0", "1");
        assertThat(bigIntegers, contains(BigInteger.ZERO, BigInteger.ONE));
    }

    @Test
    void testCreateListFromTwoNumbers() {
        List<BigInteger> bigIntegers = BigIntegerList.of(0, 1);
        assertThat(bigIntegers, contains(BigInteger.ZERO, BigInteger.ONE));
    }
}
