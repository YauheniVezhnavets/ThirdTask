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
    private final ConeValidator coneValidator;
    private final ConeParser coneParser;


    public ConeCreator(DataReader dataReader,ConeValidator coneValidator, ConeParser coneParser) {
        this.dataReader = dataReader;
        this.coneValidator = coneValidator;
        this.coneParser = coneParser;

    }

    public List<Cone> create(String filename) throws DataException {

        List<String> stringLines = dataReader.readData(filename);
        List<Cone> listOfCone = new ArrayList<>();

        for (String stringLine : stringLines) {
            if (coneValidator.validate(stringLine)) {
                Cone coneCreator = coneParser.parse(stringLine);
                listOfCone.add(coneCreator);
            }
        }
        return listOfCone;
    }
}
