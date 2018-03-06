/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class A2Q2 {
    private static boolean frontIsClear;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for oof the robot=
        
        City g = new City();
        
        //put a robot in g
        
        RobotSE oof = new RobotSE(g, 1, 1, Direction.EAST);
        
        new Wall(g, 1, 1, Direction.SOUTH);
        new Wall(g, 1, 2, Direction.SOUTH);
        new Wall(g, 1, 3, Direction.SOUTH);
        new Wall(g, 1, 4, Direction.SOUTH);
        new Wall(g, 1, 5, Direction.SOUTH);
        new Wall(g, 1, 6, Direction.SOUTH);
        new Wall(g, 1, 7, Direction.SOUTH);
        new Wall(g, 1, 8, Direction.SOUTH);
        new Wall(g, 1, 9, Direction.SOUTH);
        new Wall(g, 1, 1, Direction.EAST);
        new Wall(g, 1, 2, Direction.EAST);
        new Wall(g, 1, 4, Direction.EAST);
        new Wall(g, 1, 7, Direction.EAST);
        new Thing(g, 1, 9);
        
        while(oof.getAvenue() != 9) {
            
            if (!oof.frontIsClear()){
                oof.turnLeft();
            } else if (oof.frontIsClear()) {
                oof.move();
            } if (oof.getStreet() <= 0) {
                oof.turnRight();
                        
            }
        }
        
          
          
                  
          
        
    
    }
}
