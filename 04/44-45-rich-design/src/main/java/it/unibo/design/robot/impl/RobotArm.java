package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.*;

public class RobotArm implements CommandableRobotPart {
    private String[] commands;

    public RobotArm() {
        super();
    }

    public String[] availableCommands() {
        return this.commands;
    }

    public void sendCommand(String s) {
        for (String x: this.availableCommands()) {
            if (x.compareTo(s) == 0) {
                //things
            }
        }
    }

    public String[] getCommands() {
        return this.commands;
    }

    public void setCommands(final String[] commands) {
        this.commands = commands;
    }

    public int selectCommand(final String selected) {
        int i = 0;
        for (String x: this.commands) {
            if (selected.compareTo(x) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void turnOn() {
        super.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void consumeBattery() {
        
    }

    //getter/setter
    public boolean getStatus() {
        return this.status;
    }

    public boolean isIsMounted() {
        return this.isMounted;
    }

    public boolean getIsMounted() {
        return this.isMounted;
    }

    public void setIsMounted(boolean isMounted) {
        this.isMounted = isMounted;
    }

}