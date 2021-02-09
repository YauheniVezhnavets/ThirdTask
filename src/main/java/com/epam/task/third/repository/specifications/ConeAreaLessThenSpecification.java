package com.epam.task.third.repository.specifications;

import com.epam.task.third.enteties.Cone;
import com.epam.task.third.logic.ConeCalculator;

public class ConeAreaLessThenSpecification implements ConeSpecification {

    ConeCalculator coneCalculator;
    private final double minArea;
    private final double maxArea;


    public ConeAreaLessThenSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }


    @Override
    public boolean specified(Cone cone) {

        return coneCalculator.calculateArea(cone) > minArea && coneCalculator.calculateArea(cone) < maxArea;
    }
}
