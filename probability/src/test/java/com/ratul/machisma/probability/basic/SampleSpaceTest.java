package com.ratul.machisma.probability.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleSpaceTest {

    enum CoinState {
        HEAD,
        TAIL
    }

    @Test
    public void createSampleSpace() {
        SampleSpace ss = new SampleSpace(CoinState.class);
    }

}