/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for feezy the robot
        City majorThicc = new City();
        
        //put a robot in majorThicc
        RobotSE Feezy = new RobotSE(majorThicc, 1, 2, Direction.SOUTH);
        
        new Wall (majorThicc, 1, 2 ,Direction.SOUTH);
        
        new Wall (majorThicc, 1, 2 ,Direction.EAST);
        
        new Wall (majorThicc, 1, 2 ,Direction.NORTH);
        
        new Wall (majorThicc, 1, 1 ,Direction.NORTH);
        
        new Wall (majorThicc, 1, 1 ,Direction.WEST);
        
        new Wall (majorThicc, 2, 1 ,Direction.SOUTH);
        
        new Wall (majorThicc, 2, 1 ,Direction.WEST);
        
        new Thing(majorThicc, 2, 2);
        
        Feezy.turnRight();
        
        Feezy.move(1);
        
        Feezy.turnLeft();
        
        Feezy.move(1);
        
        Feezy.turnLeft();
        
        Feezy.move(1);
        
        Feezy.pickThing();
        
        Feezy.turnLeft(2);
        
        Feezy.move(1);
        
        Feezy.turnRight();
        
        Feezy.move(1);
        
        Feezy.turnRight();
        
        Feezy.move(1);
        
        Feezy.turnRight();
                
              
               
    }
}
