/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for deezy the robot
        City heck = new City();
        
        //put a robot in heck
        RobotSE deezy = new RobotSE (heck, 0 , 0, Direction.SOUTH);
        
        RobotSE smeezy = new RobotSE (heck, 0, 1, Direction.SOUTH);
        
        new Wall(heck, 0, 1, Direction.WEST);
        
        new Wall(heck, 1, 1, Direction.WEST);
        
        new Wall(heck, 1, 1, Direction.SOUTH);
        
        deezy.move(2);
        
        smeezy.move();
        
        deezy.turnLeft();
        
        smeezy.turnLeft();
        
        smeezy.move();
        
        smeezy.turnRight();
        
        smeezy.move();
        
        smeezy.turnRight();
        
        deezy.move();
        
        smeezy.move();
        
    }
}
