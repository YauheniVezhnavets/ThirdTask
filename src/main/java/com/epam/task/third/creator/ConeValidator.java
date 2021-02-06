package com.epam.task.third.creator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConeValidator {
    private static final String CONE_PATTERN = "^(\\d+[,.]+\\d+\\s){6}\\d+[,.]+\\d+$";

    public boolean validate (String line) {

        Pattern pattern = Pattern.compile(CONE_PATTERN);
        Matcher matcher =pattern.matcher(line);

        return  matcher.matches();

    }
}
