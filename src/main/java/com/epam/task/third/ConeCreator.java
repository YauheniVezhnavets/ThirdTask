package com.epam.task.third;

import com.epam.task.third.creator.ConeParser;
import com.epam.task.third.creator.ConeValidator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.enteties.Cone;

import java.util.ArrayList;
import java.util.List;

public class ConeCreator {
    private final DataReader dataReader;
    private final ConeParser coneParser;
    private final ConeValidator coneValidator;

    public ConeCreator(DataReader dataReader, ConeParser coneParser, ConeValidator coneValidator) {
        this.dataReader = dataReader;
        this.coneParser = coneParser;
        this.coneValidator = coneValidator;
    }

    public List<Cone> create(String filename) throws DataException {

        List<String> stringLines = dataReader.readData(filename);
        List<Cone> listOfCone = new ArrayList<Cone>();

        for (String stringLine : stringLines) {
            if (coneValidator.validate(stringLine)) {
                Cone coneCreator = coneParser.parse(stringLine);
                listOfCone.add(coneCreator);
            }
        }
        return listOfCone;
    }
}
