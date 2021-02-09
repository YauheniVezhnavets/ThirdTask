package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class ConeValidatorTest {

    public final ConeValidator coneValidator = new ConeValidator();
    private final static String EMPTY_STRING = "";
    private final static String CORRECT_STRING = "2.0 0.0 0.0 0.0 0.0 3.0 0.0";
    private final static String INCORRECT_STRING = "2.0 0.0 0. 0.0 0.0s 3.0 0.0";
    private final static String NOT_ENOUGH_DATA = "2.0 1.0 2.0 3.0";



    @Test
    public void testValidateShouldValidateWhenCorrectStringApplied(){


        //when
        boolean actual = coneValidator.validate(CORRECT_STRING);

        //then
        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldNotValidateWhenStringIsEmpty(){


        //when
        boolean actual = coneValidator.validate(EMPTY_STRING);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldNotValidateWhenIncorrectArrayApplied() {

        //when
        boolean actual = coneValidator.validate(INCORRECT_STRING);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldNotValidateWhenNotEnoughData(){


        //when
        boolean actual = coneValidator.validate(NOT_ENOUGH_DATA);

        //then
        Assert.assertFalse(actual);
    }
}
