package com.epam.task.third.observer;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.ConeObservable;
import com.epam.task.third.enteties.ConeParameters;
import com.epam.task.third.enteties.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ConeObserverTest {

    private final ConeObserver coneObserver = ConeObserver.getInstance();


    private static final Point CENTER = new Point(0.0,0.0,0.0);
    private static final Point APEX_OF_CONE = new Point(0.0,3.0,0.0);
    private static final int RADIUS = 2;
    private final ConeObservable VALID_CONE = new ConeObservable(new Circle(RADIUS,CENTER),APEX_OF_CONE);
    private static final double AREA = 35.22071741263713;
    private static final double VOLUME = 12.566370614359172;


    @Test
    public void testUpdateWithValidDataShouldSucceed(){

        coneObserver.update(VALID_CONE);
        VALID_CONE.attach(coneObserver);
        Map <Integer, ConeParameters> expected = new HashMap<>();
        ConeParameters expectedConeParameters = new ConeParameters(AREA,VOLUME);
        expected.put(1,expectedConeParameters);
        Map <Integer, ConeParameters> actual = coneObserver.getParameters();
        Assert.assertEquals(actual,expected);
    }

}
