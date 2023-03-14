package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class Movement {
    private String action;
    private String direction;
    private static String REGEX = "\"([A-Z]+) - ([A-Z]{1,2})";
    private static Pattern PATTERN = Pattern.compile(REGEX);

    public Movement(String movement) {

    }
    public String getAction() { return this.action; }
    public String getDirection() { return this.direction; }
    public Object clone() throws CloneNotSupportedException { 
        return null; 
    }
}   
