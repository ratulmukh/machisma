package com.ratul.machisma.probability.basic;

import java.util.Set;

public class Event<E extends Enum> {
    public final SampleSpace sampleSpace;
    public final Set<E> eventElements;

    public Event(SampleSpace sampleSpace, Set<E> eventElements) {
        this.sampleSpace = sampleSpace;
        this.eventElements = eventElements;

    }
}
