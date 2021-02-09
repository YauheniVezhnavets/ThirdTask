package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Cone;

import java.util.Comparator;

public class ConeComparatorByRadiusTest extends ConeComparatorTest {
    @Override
    protected Comparator<Cone> creatingConeCenterComparatorTest() {
        return new ConeComparatorByRadius();
    }
}
