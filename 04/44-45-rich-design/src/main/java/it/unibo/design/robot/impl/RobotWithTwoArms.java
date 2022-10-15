package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {
    
    private BasicArm arm1 = new BasicArm("Left");
    private BasicArm arm2 = new BasicArm("Right");;
    private int objects = 0;

    public RobotWithTwoArms(final String name) {
        super(name);
    }

    public boolean pickUp() {
        if (this.arm1.isGrabbing()) {
            if (this.arm2.isGrabbing()) {
                return false;
            }
            this.arm2.pickUp();
            super.consumeBattery(arm2.getConsuptionForPickUp());
            this.objects++;
            return true;
        } else {
            this.arm1.pickUp();
            super.consumeBattery(arm1.getConsuptionForPickUp());
            this.objects++;
            return true;
        }
    }

    public boolean dropDown() {
        if (this.arm1.isGrabbing()) {
            this.arm1.dropDown();
            super.consumeBattery(arm1.getConsuptionForDropDown());
            this.objects--;
            return true;
        } else if (this.arm2.isGrabbing()) {
            this.arm2.dropDown();
            super.consumeBattery(arm2.getConsuptionForDropDown());
            this.objects--;
            return true;
        } 
        return false;
    }

    public int getCarriedItemsCount() {
        return this.objects;
    }
}