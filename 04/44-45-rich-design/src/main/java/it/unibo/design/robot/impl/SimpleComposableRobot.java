package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.*;

public class SimpleComposableRobot extends BaseRobot implements ComposableRobot{

    public SimpleComposableRobot(String robotName) {
        super(robotName);
    }

    public void start() {
                
    }

    public void consumeBattery() {
                
    }

    public void attachComponent(RobotPart rp) {
        rp.plug(this);
    }

    public void doCycle() {
        
    }

    public void detachComponent(RobotPart rp) {
        
    }

}