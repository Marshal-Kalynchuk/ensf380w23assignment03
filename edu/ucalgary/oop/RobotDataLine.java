package edu.ucalgary.oop;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RobotDataLine implements Cloneable {
    private String dataLine;
    private String robotID;
    private Sensor sensor;
    private Movement movement;
    private LocalDate date;
    private static String DATE_REGEX = "\\[([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})\\]";
    private static Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);
    private static String ROBOT_REGEX = "\\s([0-9]{3}[A-Z]{1})\\s";
    private static Pattern ROBOT_PATTERN = Pattern.compile(ROBOT_REGEX);

    public RobotDataLine(String line) throws IllegalArgumentException {

        this.dataLine = line;
        this.sensor = new Sensor(line);
        this.movement = new Movement(line);

        Matcher m = DATE_PATTERN.matcher(line);
        if (m.find()) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            this.date = LocalDate.of(year, month, day);
        } else {
            throw new IllegalArgumentException();
        }
        m = ROBOT_PATTERN.matcher(line);
        if (m.find()) {
            this.robotID = m.group(0);
        } else {
            throw new IllegalArgumentException();
        }

    }
    public String getRobotID() { return this.robotID; }
    public String getDataLine() { return this.dataLine; }
    public Sensor getSensor() { return this.sensor; }
    public Movement getMovement() { return this.movement; }
    public LocalDate getDate() { return this.date; }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        RobotDataLine cloned = (RobotDataLine) super.clone();
        cloned.sensor = (Sensor) this.sensor.clone();
        cloned.movement = (Movement) this.movement.clone();
        cloned.date = LocalDate.of(this.date.getYear(), this.date.getMonthValue(), this.date.getDayOfMonth());
        return cloned;
    }
}
