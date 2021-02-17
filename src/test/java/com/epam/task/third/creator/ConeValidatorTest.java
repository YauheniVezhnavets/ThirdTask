package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class ConeValidatorTest {

    public final ConeValidator arrayValidator = new ConeValidator();
    private final static String EMPTY_STRING = "";
    private final static String CORRECT_STRING = "2.0 0.0 0.0 0.0 2.0 0.0 0.0 0.0 3.0 0.0";
    private final static String INCORRECT_STRING = "2.0 0.0 0. 0.0 2.s 0.0 0.0 0.0 3.0 0.0";


    @Test
    public void testValidateShouldValidateWhenCorrectStringApplied(){


        //when
        boolean actual = arrayValidator.validate(CORRECT_STRING);

        //then
        Assert.assertTrue(actual);
    }


    @Test
    public void testValidateShouldNotValidateWhenStringIsEmpty(){


        //when
        boolean actual = arrayValidator.validate(EMPTY_STRING);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldNotValidateWhenIncorrectArrayApplied() {

        //when
        boolean actual = arrayValidator.validate(INCORRECT_STRING);

        //then
        Assert.assertFalse(actual);
    }
}
