package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

import java.util.Comparator;


public class ConeCenterZComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone firstCone, Cone secondCone) {
        Circle firstConeCircle = firstCone.getCircle();
        Circle secondConeCircle = secondCone.getCircle();

        Point firstCenterPoint = firstConeCircle.getCenterOfCircle();
        Point secondCenterPoint = secondConeCircle.getCenterOfCircle();

        double firstCenterPointZ = firstCenterPoint.getZ();
        double secondCenterPointZ = secondCenterPoint.getZ();

        return Double.compare(firstCenterPointZ,secondCenterPointZ);
    }
}
