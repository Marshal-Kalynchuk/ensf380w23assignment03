package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class Sensor {
    private String sensor;
    private static String REGEX = "\\(([a-z]+\\))";
    private static Pattern PATTERN = Pattern.compile(REGEX);

    public Sensor(String sensor) {

    }
    public String getSensor() { return sensor; }

    public Object clone() {
        return null;
    }
}
