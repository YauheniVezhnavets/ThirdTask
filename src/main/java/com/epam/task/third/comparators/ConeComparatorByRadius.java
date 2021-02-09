package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;

import java.util.Comparator;

public class ConeComparatorByRadius implements Comparator <Cone> {
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Circle firstConeCircle = firstCone.getCircle();
        Circle secondConeCircle = secondCone.getCircle();

        double firstConeRadius = firstConeCircle.getRadius();
        double secondConeRadius = secondConeCircle.getRadius();

       return Double.compare(firstConeRadius,secondConeRadius);

    }
}
