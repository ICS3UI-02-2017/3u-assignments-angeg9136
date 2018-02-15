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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for yeezy the robot
        City bigBoy = new City();
        
        //put a robot in bigBoy
         RobotSE yeezy = new RobotSE(bigBoy, 0, 2, Direction.WEST);
        
        new Wall (bigBoy, 1, 1 ,Direction.WEST);
        
        new Wall (bigBoy, 1, 2 ,Direction.EAST);
        
        new Wall (bigBoy, 1, 1 ,Direction.NORTH);
        
        new Wall (bigBoy, 2, 1 ,Direction.WEST);
        
        new Wall (bigBoy, 1, 2 ,Direction.NORTH);
        
        new Wall (bigBoy, 2, 2 ,Direction.SOUTH);
        
        new Wall (bigBoy, 2, 1 ,Direction.SOUTH);
        
        new Wall (bigBoy, 2, 2 ,Direction.EAST);
        
        yeezy.move(2);
        
        yeezy.turnLeft();
        
        yeezy.move(3);
        
        yeezy.turnLeft();
        
        yeezy.move(3);
        
        yeezy.turnLeft();
        
        yeezy.move(3);
        
        yeezy.turnLeft();
        
        yeezy.move(1);
              
                
    }
}
