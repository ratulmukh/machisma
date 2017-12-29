package com.ratul.machisma.probability.basic;

import org.junit.Test;

import java.util.EnumSet;
import java.util.Set;

import static com.ratul.machisma.probability.basic.SampleSpaceTest.CoinState.*;
import static org.junit.Assert.*;

public class SampleSpaceTest {

    enum CoinState {
        HEAD,
        TAIL
    }

    @Test
    public void createSampleSpace() {
        SampleSpace ss = new SampleSpace(CoinState.class);
        System.out.println(ss);

        Set<CoinState> g = Set.of(HEAD, TAIL);
        Set<String> gStr = Set.of("HEAD", "TAIL");
        Event<CoinState> h = new Event<>(ss, g);

        EnumSet<CoinState>  event1 = EnumSet.of(HEAD);
    }

}