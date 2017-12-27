package com.ratul.machisma.probability;

import com.ratul.machisma.probability.distributions.ProbDistribution;

public class RandomVariable {

    private final Type type;
    private final ProbDistribution probDistribution;

    public RandomVariable(Type type, ProbDistribution probDistribution) {
        this.type = type;
        this.probDistribution = probDistribution;
    }

    public enum Type {
        DISCRETE,
        CONTINUOUS
    }
}
