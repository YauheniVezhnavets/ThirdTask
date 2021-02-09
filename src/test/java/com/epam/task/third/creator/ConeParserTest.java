package com.epam.task.third.creator;

import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;
import org.junit.Assert;
import org.junit.Test;

public class ConeParserTest {

    private static final ConeParser coneParser = new ConeParser();
    private static final String CORRECT_LINE = "2.0 0.0 0.0 0.0 0.0 3.0 0.0";
    private static final String CORRECT_LINE_WITH_NEGATIVE_NUMBER = "2.0 -1.0 0.0 0.0 -1.0 3.0 0.0";

    @Test
    public void testValidateShouldValidateWhenCorrectStringApplied(){

        //given
        Cone expected = new Cone(new Circle(2.0,new Point(0.0,0.0,0.0)), new Point(0.0, 3.0,0.0));


        //when
        Cone actual = coneParser.parse(CORRECT_LINE);

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testValidateShouldValidateWhenCorrectStringWithNegativeNumberApplied(){

        //given
        Cone expected = new Cone(new Circle(2.0,new Point(-1.0,0.0,0.0)), new Point(-1.0, 3.0,0.0));


        //when
        Cone actual = coneParser.parse(CORRECT_LINE_WITH_NEGATIVE_NUMBER);

        //then
        Assert.assertEquals(expected,actual);
    }
}
