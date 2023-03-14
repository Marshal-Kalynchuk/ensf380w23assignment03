package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Movement implements FormattedOutput, Cloneable {
    private String action;
    private String direction;
    private static String REGEX = "\"([A-Z]+) - ([A-Z]{1,2})";
    private static Pattern PATTERN = Pattern.compile(REGEX);

    public Movement(String movement) throws IllegalArgumentException {
        Matcher m = PATTERN.matcher(movement);
        if (m.find()) {
            this.action = m.group(1);
            this.direction = m.group(2);
        }
    }
    public String getAction() { return this.action; }
    public String getDirection() { return this.direction; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Movement cloned = (Movement) super.clone();
        cloned.action = this.action;
        cloned.direction = this.direction;
        return cloned;
    }

    public String getFormatted() {
        return "Action: " + this.action + ", Direction: " + Directions.valueOf(this.direction).toString();
    }
}