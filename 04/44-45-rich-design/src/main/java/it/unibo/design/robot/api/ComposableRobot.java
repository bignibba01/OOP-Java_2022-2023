package it.unibo.design.robot.api;

public interface ComposableRobot extends Robot{
    void start();

    void consumeBattery();

    void attachComponent(RobotPart rp);

    void doCycle();

    void detachComponent(RobotPart rp);
}
