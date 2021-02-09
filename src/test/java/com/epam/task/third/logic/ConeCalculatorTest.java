package com.epam.task.third.logic;


import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;
import org.junit.Assert;
import org.junit.Test;


public class ConeCalculatorTest {

    private final ConeCalculator coneCalculator = new ConeCalculator();
    private final static double NEGATIVE_RADIUS = -1;
    private final static double POSITIVE_RADIUS = 2;
    private final static double VOLUME_RATIO = 0.703;
    private final static double LENGTH_OF_SEPARATION_CONE = 1;
    private final static double ZERO_LENGTH_OF_SEPARATION_CONE = 0;
    private final static double DELTA = 0.01;
    private final static double RETURN_ONE = 1;
    private final static double CORRECT_CONE_AREA = 35.22;
    private final static double CORRECT_CONE_VOLUME = 12.56;

    private final Cone CORRECT_CONE = new Cone(new Circle(2.0, new Point(0.0, 0.0, 0.0)),
            new Point(0.0, 3.0, 0.0));
    private final Cone INCORRECT_CONE = new Cone(new Circle(4.0, new Point(1.0, 1.0, 1.0)),
            new Point(1.0, 5.0, 1.0));


    @Test
    public void isCorrectRadiusTestShouldReturnFalseWhenRadiusNegative() {

        //when
        boolean isCorrectRadius = coneCalculator.isCorrectRadius(NEGATIVE_RADIUS);

        //then
        Assert.assertFalse(isCorrectRadius);

    }

    @Test
    public void isCorrectRadiusTestShouldReturnTrueWhenRadiusPositive() {

        //when
        boolean isCorrectRadius = coneCalculator.isCorrectRadius(POSITIVE_RADIUS);

        //then
        Assert.assertTrue(isCorrectRadius);

    }

    @Test
    public void isConeTestShouldReturnFalseWhenTwoPointIsNotCorrect() {

        //when
        boolean isCone = coneCalculator.isCone(INCORRECT_CONE);

        //then
        Assert.assertTrue(isCone);

    }

    @Test
    public void isConeTestShouldReturnTrueWhenTwoPointIsCorrect() {

        //when
        boolean isCone = coneCalculator.isCone(CORRECT_CONE);

        //then
        Assert.assertTrue(isCone);

    }

    @Test
    public void separateConeTestShouldCalculateVolumeRatioWhenDataCorrect() {


        //when
        double actual = coneCalculator.separateCone(CORRECT_CONE, LENGTH_OF_SEPARATION_CONE);

        //then
        Assert.assertEquals(VOLUME_RATIO, actual, DELTA);

    }

    @Test
    public void separateConeTestShouldReturnOneWhenConeNotSeparated() {


        //when
        double actual = coneCalculator.separateCone(CORRECT_CONE, ZERO_LENGTH_OF_SEPARATION_CONE);

        //then
        Assert.assertEquals(RETURN_ONE, actual, DELTA);

    }

    @Test
    public void testCalculateAreaShouldSucceedWhenCorrectCone() {
        double actual = coneCalculator.calculateArea(CORRECT_CONE);
        Assert.assertEquals(CORRECT_CONE_AREA, actual, DELTA);
    }

    @Test
    public void testCalculateVolumeShouldSucceedWhenCorrectCone() {

        double actual = coneCalculator.calculateVolume(CORRECT_CONE);
        Assert.assertEquals(CORRECT_CONE_VOLUME, actual, DELTA);
    }

}
