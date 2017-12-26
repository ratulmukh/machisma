package com.ratul.machisma.probability;

import scala.Tuple2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiscreteProbabDistribution implements ProbDistribution {

    List<Tuple2<Double, Double>> probMassMap;

    public DiscreteProbabDistribution(List<Tuple2<Double, Double>> probMassMap) throws ProbabilityException {

        Comparator<Tuple2<Double, Double>> comparator = new Comparator<Tuple2<Double, Double>>() {
            public int compare(Tuple2<Double, Double> tupleA, Tuple2<Double, Double> tupleB) {
                return tupleA._1.compareTo(tupleB._1);
            }
        };

        Collections.sort(probMassMap, comparator);

        for(int i=0; i<probMassMap.size()-1; i++) {
            if(probMassMap.get(i)._1==probMassMap.get(i+1)._1) {
                throw new ProbabilityException("Duplicate domain value");
            }
        }

        Double sumOfProb = probMassMap
                .stream()
                .map(Tuple2::_2)
                .reduce(0.0, (Double a, Double b) -> Double.sum(a, b));

        if(sumOfProb !=1 ) {
            throw new ProbabilityException("Probability mass distribution does not add upto 1");
        }

        this.probMassMap = probMassMap;
    }
}


