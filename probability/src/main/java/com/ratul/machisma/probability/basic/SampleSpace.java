package com.ratul.machisma.probability.basic;

public class SampleSpace<E extends Enum<E>> {

    public final Class<E> spaceEnum;

    public SampleSpace(Class<E> spaceEnum) {
        this.spaceEnum = spaceEnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (Enum enumVal: spaceEnum.getEnumConstants()) {
            sb.append(enumVal.toString() + " ");
        }
        sb.append("}");
        return  sb.toString();
    }

}
