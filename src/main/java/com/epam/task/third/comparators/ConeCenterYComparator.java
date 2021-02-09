package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

import java.util.Comparator;


public class ConeCenterYComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Circle firstConeCircle = firstCone.getCircle();
        Circle secondConeCircle = secondCone.getCircle();

        Point firstCenterPoint = firstConeCircle.getCenterOfCircle();
        Point secondCenterPoint = secondConeCircle.getCenterOfCircle();

        double firstCenterPointY = firstCenterPoint.getY();
        double secondCenterPointY = secondCenterPoint.getY();

        return Double.compare(firstCenterPointY,secondCenterPointY);
    }
}
