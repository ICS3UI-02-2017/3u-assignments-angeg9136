/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pkg11.assignments;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *learning how to use the robots
 * @author angeg9136
 */
public class Gr11Assignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for momo the robot
        City longBoy = new City();
        
        // put a robot in longBoy
        RobotSE momoussa = new RobotSE(longBoy, 2, 3, Direction.EAST);
        
        momoussa.move(50);
        
        momoussa.turnLeft(1);
        
        momoussa.turnRight(80);
        
        new Wall(longBoy, 2, 5, Direction.WEST);
        
        momoussa.examineLights();
        
    }
}
