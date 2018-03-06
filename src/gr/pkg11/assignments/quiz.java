/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pkg11.assignments;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for naenae the robot
        
        City oof = new City();
        
        //put a robot in oof
        
        RobotSE naenae = new RobotSE (oof, 4, 0, Direction.EAST);
        
        new Wall (oof, 4, 2, Direction.WEST);
        new Wall (oof, 4, 2, Direction.NORTH);
        new Wall (oof, 3, 3, Direction.WEST);
        new Wall (oof, 3, 3, Direction.NORTH);
        new Wall (oof, 2, 4, Direction.WEST);
        new Wall (oof, 2, 4, Direction.NORTH);
        new Wall (oof, 2, 5, Direction.NORTH);
        new Wall (oof, 2, 5, Direction.EAST);
        new Wall (oof, 3, 6, Direction.NORTH);
        new Wall (oof, 3, 6, Direction.EAST);
        new Wall (oof, 4, 7, Direction.NORTH);
        new Wall (oof, 4, 7, Direction.EAST);
        
        new Thing(oof, 4, 1);
        new Thing(oof, 3, 2);
        new Thing(oof, 2, 3);
        new Thing(oof, 1, 4);
        
        naenae.move();
        naenae.pickThing();
        naenae.turnLeft();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.pickThing();
        naenae.turnLeft();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.pickThing();
        naenae.turnLeft();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.pickThing();
        naenae.move();
        naenae.countThingsInBackpack();
        naenae.putThing();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.putThing();
        naenae.turnLeft();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.putThing();
        naenae.turnLeft();
        naenae.move();
        naenae.turnRight();
        naenae.move();
        naenae.putThing();
        naenae.turnLeft();
        naenae.move();
        
        
     
                
        
               
        
        
        
               
        
  
    }
}
