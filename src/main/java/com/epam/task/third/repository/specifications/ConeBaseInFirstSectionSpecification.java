package com.epam.task.third.repository.specifications;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;


public class ConeBaseInFirstSectionSpecification implements ConeSpecification {


    @Override
    public boolean specified(Cone cone) {
        Circle circle = cone.getCircle();
        Point centerOfCircle = circle.getCenterOfCircle();
        return (centerOfCircle.getX()>=0)&&(centerOfCircle.getY()>=0)&&(centerOfCircle.getZ()==0);
    }
}
