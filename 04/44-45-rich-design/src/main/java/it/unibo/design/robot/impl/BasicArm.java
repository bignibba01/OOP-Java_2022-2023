package it.unibo.design.robot.impl;

public class BasicArm {
    public static final double PICK_CONSUMPTION = 2;
    public static final double DROP_CONSUMPTION = 1;
    
    private boolean grab = false;
    private String name;

    public BasicArm(final String name) {
        this.name = name;
    }

    public boolean isGrabbing() {
        return this.grab;
    }

    public void pickUp() {
        this.grab = true;
    }

    public void dropDown() {
        this.grab = false;
    }

    public double getConsuptionForPickUp() {
        return PICK_CONSUMPTION;
    }

    public double getConsuptionForDropDown() {
        return DROP_CONSUMPTION;
    }

}