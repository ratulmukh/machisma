package com.ratul.machisma.probability.basic;

public class SampleSpace<E extends Enum<E>> {

    private Class<E> spaceEnum;

    public SampleSpace(Class<E> spaceEnum) {
        for (Enum<E> enumVal: spaceEnum.getEnumConstants()) {
            System.out.println(enumVal.toString());
        }

        this.spaceEnum = spaceEnum;
    }

}
