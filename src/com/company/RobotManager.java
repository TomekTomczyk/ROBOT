package com.company;

public class RobotManager {

    private BoxManager boxManager = new BoxManager();
    private Robot robot = new Robot();

    public void decodeCommands(String command) {

        int block = 0;

        for(String s : command.split("")) {

            if (s.equals("P"))
                block = robot.pickUpBlock();
            else if (s.equals("M"))
                robot.moveBlock(boxManager);
            else if (s.equals("L"))
                robot.lowerBlock(block, boxManager);
        }

    }

    public void startRobot(String command) {

        decodeCommands(command);
        boxManager.showInfo();


    }
}
