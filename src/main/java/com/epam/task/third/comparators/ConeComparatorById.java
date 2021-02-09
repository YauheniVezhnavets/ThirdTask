package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Cone;

import java.util.Comparator;

public class ConeComparatorById implements Comparator<Cone> {

    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        int firstIDCone = firstCone.getId();
        int secondIDCone = secondCone.getId();

        return Integer.compare(firstIDCone,secondIDCone);
    }
}
