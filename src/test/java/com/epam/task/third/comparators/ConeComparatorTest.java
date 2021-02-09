package com.epam.task.third.comparators;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.ConeObservable;
import com.epam.task.third.enteties.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public abstract class ConeComparatorTest {
    private Comparator <Cone> coneCenterComparator = creatingConeCenterComparatorTest();
    private static final Point BIGGER_CONE_CENTER = new Point(1.0,1.0,1.0);
    private static final Point SMALLER_CONE_CENTER = new Point(0.0,0.0,0.0);
    private static final Point BIGGER_CONE_APEX_OF_CONE = new Point(0.0,5.0,0.0);
    private static final Point SMALLER_CONE_APEX_OF_CONE = new Point(0.0,3.0,0.0);
    private static final int BIGGER_CONE_RADIUS = 4;
    private static final int SMALLER_CONE_RADIUS = 2;
    private static final Cone SMALLER_CONE = new Cone(new Circle(SMALLER_CONE_RADIUS,SMALLER_CONE_CENTER),SMALLER_CONE_APEX_OF_CONE);
    private static final Cone BIGGER_CONE = new Cone(new Circle(BIGGER_CONE_RADIUS,BIGGER_CONE_CENTER),BIGGER_CONE_APEX_OF_CONE);




   protected abstract Comparator <Cone> creatingConeCenterComparatorTest();


   @Test
    public void testCompareShouldReturnZeroWhenConesEquals (){
       // when
       int actual = coneCenterComparator.compare(BIGGER_CONE,BIGGER_CONE);

       //then
       Assert.assertEquals(0, actual);
   }

    @Test
    public void testCompareShouldReturnOneWhenFirstConeBiggerSecondCone (){
        // when
        int actual = coneCenterComparator.compare(BIGGER_CONE,SMALLER_CONE);

        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCompareShouldReturnMinusOneWhenSecondConeBiggerFirsCone (){
        // when
        int actual = coneCenterComparator.compare(SMALLER_CONE,BIGGER_CONE);

        //then
        Assert.assertEquals(-1, actual);
    }


}
