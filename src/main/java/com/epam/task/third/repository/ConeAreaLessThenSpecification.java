package com.epam.task.third.repository;

import com.epam.task.third.enteties.Cone;
import com.epam.task.third.logic.ConeCalculator;

public class ConeAreaLessThenSpecification implements ConeSpecification {

    ConeCalculator coneCalculator;
    private double area;


    public ConeAreaLessThenSpecification (double area){
        this.area = area;
    }


    @Override
    public boolean specified(Cone cone) {
        return  coneCalculator.calculateArea(cone)<area;
    }
}
