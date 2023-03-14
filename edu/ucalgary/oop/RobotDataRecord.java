package edu.ucalgary.oop;

import java.util.ArrayList;

public class RobotDataRecord implements Cloneable {
    private ArrayList<RobotDataLine> log;

    public RobotDataRecord(String[] array) {
        this.log = new ArrayList<RobotDataLine>();
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
    @Override
    public Object clone() throws CloneNotSupportedException {

        RobotDataRecord cloned = (RobotDataRecord) super.clone();
        cloned.log = new ArrayList<RobotDataLine>();
        for (RobotDataLine line : this.log) {
            cloned.log.add((RobotDataLine) line.clone());
        }
        return cloned;

    }
}
