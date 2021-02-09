package com.epam.task.third;

import com.epam.task.third.creator.ConeParser;
import com.epam.task.third.creator.ConeValidator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.enteties.Circle;
import com.epam.task.third.enteties.Cone;
import com.epam.task.third.enteties.Point;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ConeCreatorTest {

    public final static List<String> TEST_DATA = Arrays.asList("2.0 0.0 0.0 0.0 0.0 3.0 0.0",
            "4.0 1.0 1.0 1.0 1.0 5.0 1.0");
    private final static String EMPTY_STRING = "";
    private final Cone FIRST_CONE = new Cone(new Circle(2.0, new Point(0.0, 0.0, 0.0)),
            new Point(0.0, 3.0, 0.0));
    private final Cone SECOND_CONE = new Cone(new Circle(4.0, new Point(1.0, 1.0, 1.0)),
            new Point(1.0, 5.0, 1.0));

    @Test
    public void testCreateShouldCreateArrayWhenFileHaveCorrectData() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ConeValidator validator = Mockito.mock(ConeValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ConeParser parser = Mockito.mock(ConeParser.class);
        when(parser.parse("2.0 0.0 0.0 0.0 0.0 3.0 0.0")).thenReturn(new Cone(new Circle(2.0,
                new Point(0.0, 0.0, 0.0)), new Point(0.0, 3.0, 0.0)));
        when(parser.parse("4.0 1.0 1.0 1.0 1.0 5.0 1.0")).thenReturn(new Cone(new Circle(4.0,
                new Point(1.0, 1.0, 1.0)), new Point(1.0, 5.0, 1.0)));


        ConeCreator coneCreator = new ConeCreator(reader, validator, parser);

        List<Cone> actual = coneCreator.create(EMPTY_STRING);
        List<Cone> expected = new ArrayList<>();

        expected.add(FIRST_CONE);
        expected.add(SECOND_CONE);


        Assert.assertEquals(expected, actual);
    }
}
