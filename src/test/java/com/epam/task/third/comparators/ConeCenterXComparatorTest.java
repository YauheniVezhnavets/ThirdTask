package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Cone;

import java.util.Comparator;

public class ConeCenterXComparatorTest extends ConeComparatorTest {
    @Override
    protected Comparator<Cone> creatingConeCenterComparatorTest() {
        return new ConeCenterZComparator();
    }
}
