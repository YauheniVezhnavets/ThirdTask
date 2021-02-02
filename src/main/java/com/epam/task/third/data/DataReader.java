package com.epam.task.third.data;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> readData(String filename) throws DataException {

        List<String> strings = new ArrayList<String>();


        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
            reader.close();

        } catch (Exception e) {
            throw new DataException(e.getMessage(), e);
        }


        return strings;
    }
}



