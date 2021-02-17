package com.epam.task.third.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> readData(String filename) throws DataException {

        List<String> strings = new ArrayList<String>();
        FileReader reader = null;


        try {
            reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new DataException(e.getMessage(), e);
                }
            }
        }


        return strings;
    }
}



