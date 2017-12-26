package com.ratul.machisma.probability;

public class ProbabilityException extends Exception {
    public ProbabilityException() {
        super();
    }

    public ProbabilityException(String msg) {
        super(msg);
    }

    public ProbabilityException(Exception e) {
        super(e);
    }
}
