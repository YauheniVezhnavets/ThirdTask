package com.epam.task.third.creator;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;

public class ConeParser {

    private static final String SPLIT_SEPARATOR = " ";


    public Cone parse (String string){

        String [] dataOfDoubles = string.split(SPLIT_SEPARATOR);

        double radius = Double.parseDouble(dataOfDoubles[0]);
        double pointOfCenterX = Double.parseDouble(dataOfDoubles[1]);
        double pointOfCenterY = Double.parseDouble(dataOfDoubles[2]);
        double pointOfCenterZ = Double.parseDouble(dataOfDoubles[3]);
        double apexOfConeX=Double.parseDouble(dataOfDoubles[4]);
        double apexOfConeY=Double.parseDouble(dataOfDoubles[5]);
        double apexOfConeZ=Double.parseDouble(dataOfDoubles[6]);



        return new Cone(new Circle(radius,new Point(pointOfCenterX,pointOfCenterY,pointOfCenterZ)),
                new Point(apexOfConeX,apexOfConeY,apexOfConeZ));
    }

}
