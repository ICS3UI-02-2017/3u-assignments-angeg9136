/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author angeg9136
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for yeezy the robot
        
        City thic = new City();
        
        //put a robot in thic
        
        RobotSE yeezy = new RobotSE (thic, 69, 9, Direction.SOUTH);
        
        while (!yeezy.isFacingWest())  {
    
            yeezy.turnLeft();
        }
        while (yeezy.getAvenue() != 0) {
            yeezy.move();  
        }       
        
        yeezy.turnRight();
        
        while (yeezy.getStreet() !=0) {
            yeezy.move();
        
            
        }
        
    }
}
