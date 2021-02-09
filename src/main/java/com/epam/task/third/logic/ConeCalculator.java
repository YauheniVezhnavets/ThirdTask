package com.epam.task.third.logic;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

public class ConeCalculator {

    final int DEGREE = 2;

    public boolean isCorrectRadius(double radius) {
        return radius > 0;
    }

    public boolean isCone(Cone cone) {
        Circle circle = cone.getCircle();
        if (!isCorrectRadius(circle.getRadius())) {
            return false;
        }
        Point pointOfApexCone = cone.getApexOfCone();
        Point pointOfCenter = circle.getCenterOfCircle();

        if ((pointOfCenter.getX() == pointOfApexCone.getX()) && (pointOfCenter.getY() == pointOfApexCone.getY())
                && (pointOfCenter.getZ() != pointOfApexCone.getZ())) {
            return true;
        } else if ((pointOfCenter.getX() == pointOfApexCone.getX()) && (pointOfCenter.getZ() == pointOfApexCone.getZ())
                && (pointOfCenter.getY() != pointOfApexCone.getY())) {
            return true;
        } else
            return (pointOfCenter.getY() == pointOfApexCone.getY()) && (pointOfCenter.getZ() == pointOfApexCone.getZ())
                    && (pointOfCenter.getX() != pointOfApexCone.getX());
    }


    public double separateCone(Cone cone, double lengthOfSeparationCone) {
        if (lengthOfSeparationCone == 0) {
            return 1;
        }
        Circle circleOfCone = cone.getCircle();

        double coneHeight = calculateConeHeight(cone.getApexOfCone(), circleOfCone.getCenterOfCircle());
        double tangentOfAngle = Math.tan(circleOfCone.getRadius() / coneHeight);

        double newConeHeight = Math.abs(coneHeight - lengthOfSeparationCone);
        double newRadius = newConeHeight * tangentOfAngle;
        double newAreaOfCircle = Math.PI * Math.pow(newRadius, DEGREE);

        double newAreaCone = newAreaOfCircle * newConeHeight / 3;
        double coneArea = calculateVolume(cone);

        return newAreaCone / (coneArea - newAreaCone);
    }

    public boolean isCircleOnCoordinatePlane (Cone cone){
        Circle circleOfCone = cone.getCircle();
        Point centerOfCircle = circleOfCone.getCenterOfCircle();

        return ((centerOfCircle.getX()!=0)&&(centerOfCircle.getY()!=0)&&(centerOfCircle.getZ()==0)||
                (centerOfCircle.getX()!=0)&&(centerOfCircle.getZ()!=0)&&(centerOfCircle.getY()==0))||
                (centerOfCircle.getY()!=0)&&(centerOfCircle.getZ()!=0)&&(centerOfCircle.getX()==0);

    }


    public double calculateArea(Cone cone) {
        Circle circleOfCone = cone.getCircle();
        double coneSide = calculateConeSide(cone.getApexOfCone(), cone.getCircle());
        return Math.PI * circleOfCone.getRadius() * (circleOfCone.getRadius() + coneSide);
    }

    public double calculateVolume(Cone cone) {
        Circle circleOfCone = cone.getCircle();
        double areaOfCircle = Math.PI * Math.pow(circleOfCone.getRadius(), DEGREE);
        double coneHeight = calculateConeHeight(cone.getApexOfCone(), circleOfCone.getCenterOfCircle());
        return areaOfCircle * coneHeight / 3;

    }

    public Point createPointOnCircle(Circle circle) {
        Point centerOfCircle = circle.getCenterOfCircle();
        double coordinateNewPointX = centerOfCircle.getX() + circle.getRadius();
        double coordinateNewPointY = centerOfCircle.getY();
        double coordinateNewPointZ = centerOfCircle.getZ();
        return new Point(coordinateNewPointX, coordinateNewPointY, coordinateNewPointZ);
    }

    public double calculateConeHeight(Point apexOfCone, Point centerOfCircle) {

        return Math.sqrt(Math.pow(apexOfCone.getX() - centerOfCircle.getX(), DEGREE) +
                Math.pow(apexOfCone.getY() - centerOfCircle.getY(), DEGREE) + Math.pow(apexOfCone.getZ() - centerOfCircle.getZ(), DEGREE));

    }

    public double calculateConeSide(Point apexOfCone, Circle circle) {
        Point pointOnCircle = createPointOnCircle(circle);

        return Math.sqrt(Math.pow(apexOfCone.getX() - pointOnCircle.getX(), DEGREE) +
                Math.pow(apexOfCone.getY() - pointOnCircle.getY(), DEGREE) + Math.pow(apexOfCone.getZ() - pointOnCircle.getZ(), DEGREE));

    }
}
