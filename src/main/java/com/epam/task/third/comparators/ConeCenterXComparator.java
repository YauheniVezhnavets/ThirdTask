package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

import java.util.Comparator;

public class ConeCenterXComparator implements Comparator <Cone> {
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Circle firstConeCircle = firstCone.getCircle();
        Circle secondConeCircle = secondCone.getCircle();

        Point firstCenterPoint = firstConeCircle.getCenterOfCircle();
        Point secondCenterPoint = secondConeCircle.getCenterOfCircle();

        double firstCenterPointX = firstCenterPoint.getX();
        double secondCenterPointX = secondCenterPoint.getX();

        return Double.compare(firstCenterPointX,secondCenterPointX);
    }
}
