package com.epam.task.third.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DataReaderTest {

    //given
    public  final static String TEST_DATA = "./src/test/resources/input.txt";
    public  final static String NO_FILE = "./src/test/resources/input";
    public  final static String EMPTY_FILE = "./src/test/resources/empty.txt";

    private final DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReadLineWhenFilenameIsCorrect() throws DataException {

        //when
        List<String> actual = reader.readData(TEST_DATA);
        List<String> expected = Arrays.asList("1 3 5", "10 30 45");

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadDataShouldReturnEmptyListWhenFileIsEmpty() throws DataException {

        //when
        List<String> actual = reader.readData(EMPTY_FILE);
        List<String> expected = new ArrayList<String>();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = DataException.class)
    public void testReadDataShouldThrowDataExceptionWhenFileIsNotFound() throws DataException {

        //when
        List<String> actual = reader.readData(NO_FILE);

    }
}
