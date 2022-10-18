package it.unibo.design.robot.api;

import it.unibo.design.robot.api.*;

public abstract class AbstractRobotPart implements RobotPart {
    private boolean isMounted;
    private boolean status;
    private ComposableRobot attachedTo;

    public abstract void consumeBattery() ;

    public AbstractRobotPart(boolean isMounted, boolean status) {
        this.isMounted = isMounted;
        this.status = status;
    }

    public AbstractRobotPart() {

    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    protected boolean isIsMounted() {
        return this.isMounted;
    }

    protected boolean getIsMounted() {
        return this.isMounted;
    }

    protected void setIsMounted(boolean isMounted) {
        this.isMounted = isMounted;
    }

    protected boolean getStatus() {
        return this.status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

}
