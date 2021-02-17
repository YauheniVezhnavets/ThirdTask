package com.epam.task.third.logic;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

public class ConeCalculator {
    final int DEGREE = 2;

    public boolean isCorrectRadius(double radius) {
        return radius > 0;
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
