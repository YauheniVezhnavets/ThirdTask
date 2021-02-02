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
        double pointOnCircleX=Double.parseDouble(dataOfDoubles[4]);
        double pointOnCircleY=Double.parseDouble(dataOfDoubles[5]);
        double pointOnCircleZ=Double.parseDouble(dataOfDoubles[6]);
        double apexOfConeX=Double.parseDouble(dataOfDoubles[7]);
        double apexOfConeY=Double.parseDouble(dataOfDoubles[8]);
        double apexOfConeZ=Double.parseDouble(dataOfDoubles[9]);



        return new Cone(new Circle(radius,new Point(pointOfCenterX,pointOfCenterY,pointOfCenterZ),
                new Point(pointOnCircleX,pointOnCircleY,pointOnCircleZ)),new Point(apexOfConeX,apexOfConeY,apexOfConeZ));
    }

}
