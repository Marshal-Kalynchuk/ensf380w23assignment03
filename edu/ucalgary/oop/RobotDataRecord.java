package edu.ucalgary.oop;

import java.util.ArrayList;

public class RobotDataRecord {
    private ArrayList<RobotDataLine> log;

    public RobotDataRecord(String[] array) {
        for (String line : array) {
            try {
                this.log.add(new RobotDataLine(line));
            } catch(IllegalArgumentException e) {
                System.out.println(e);
            }
        }
    }
    public RobotDataLine getLine(int index) {
        return this.log.get(index);
    }
    public ArrayList<RobotDataLine> getDataRecord() {
        return this.log;
    }
    public Object clone() throws CloneNotSupportedException {
        return null;
    }
}
