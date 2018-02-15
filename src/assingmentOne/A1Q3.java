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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for geezy the robot
        City oof = new City();
        
        //put a robot in oof
        RobotSE geezy = new RobotSE (oof, 3, 0, Direction.EAST);
        
        new Thing (oof, 3, 1);
        
        new Wall (oof, 3, 2 ,Direction.WEST);
        
        new Wall (oof, 3, 2 ,Direction.NORTH);
        
        new Wall (oof, 2, 3 ,Direction.WEST);
        
        new Wall (oof, 1, 3 ,Direction.WEST);
        
        new Wall (oof, 3, 2 ,Direction.NORTH);
        
        new Wall (oof, 1, 3,Direction.NORTH);
        
        new Wall (oof, 1, 3,Direction.EAST);
        
        new Wall (oof, 2, 4,Direction.EAST);
        
        new Wall (oof, 2, 4,Direction.NORTH);
        
        new Wall (oof, 3, 4,Direction.EAST);
        
        geezy.move();
        
        geezy.pickThing();
        
        geezy.turnLeft();
        
        geezy.move(1);
        
        geezy.turnRight();
        
        geezy.move();
        
        geezy.turnLeft();
        
        geezy.move(2); 
        
        geezy.turnRight();
        
        geezy.move();
        
        geezy.putThing();
        
        geezy.move();
        
        geezy.turnRight();
        
        geezy.move();
        
        geezy.turnLeft();
        
        geezy.move();
        
        geezy.turnRight();
        
        geezy.move(2);
        
        geezy.turnLeft();
                
        
    
               
      
        
        
               
        
        
        
        
        
        
        
    }
}
