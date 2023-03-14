package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sensor implements FormattedOutput, java.lang.Cloneable {
    private String sensor;
    private static String REGEX = "\\(([a-z]+\\))";
    private static Pattern PATTERN = Pattern.compile(REGEX);

    public Sensor(String sensor) throws IllegalArgumentException {
        Matcher m = PATTERN.matcher(sensor);
        if (m.find()) {
            this.sensor = m.group(0);
        } else {
            throw new IllegalArgumentException();
        }
    }
    public String getSensor() { return this.sensor; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sensor cloned = (Sensor) super.clone();
        cloned.sensor = this.sensor;
        return cloned;
    }
    @Override
    public String getFormatted() {
        return "Sensor: " + this.sensor;
    }
}
