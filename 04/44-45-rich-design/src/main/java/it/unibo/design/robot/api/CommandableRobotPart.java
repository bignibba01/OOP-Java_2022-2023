package it.unibo.design.robot.api;

public interface CommandableRobotPart extends RobotPart{
    int selectCommand(String s);

    String[] availableCommands();

    void sendCommand(String s);

}
