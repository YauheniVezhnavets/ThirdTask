package com.epam.task.third.creator;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Point;


public class CircleValidator {
    private final int DEGREE = 2;


    public boolean validate(Circle circle) {
        boolean result = false;

        Point center = circle.getCenterOfCircle();
        Point pointOnCircle = circle.getPointOnCircle();

        double lengthBetweenPoints = Math.sqrt(Math.pow(pointOnCircle.getX() - center.getX(), DEGREE) +
                Math.pow(pointOnCircle.getY() - center.getY(), DEGREE) + Math.pow(pointOnCircle.getZ() - center.getZ(), DEGREE));

        if ((int) lengthBetweenPoints == circle.getRadius()) {
            result = true;
        }

        return result;
    }
}
