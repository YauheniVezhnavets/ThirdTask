package com.epam.task.third.repository.specifications;

import com.epam.task.third.enteties.Cone;
import com.epam.task.third.logic.ConeCalculator;

public class ConeVolumeLessThenSpecification implements ConeSpecification {

    ConeCalculator coneCalculator;
    private double minArea;
    private double maxArea;


    public ConeVolumeLessThenSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }


    @Override
    public boolean specified(Cone cone) {

        return coneCalculator.calculateVolume(cone) > minArea && coneCalculator.calculateVolume(cone) < maxArea;
    }
}
