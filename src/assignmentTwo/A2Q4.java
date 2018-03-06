/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for yeet the robot
        
        City naenae = new City();
        
        //put a robot in naenae
        
        RobotSE yeet = new RobotSE (naenae, 1, 2, Direction.EAST);
        
        new Wall (naenae, 1, 1, Direction.EAST);
        new Wall (naenae, 1, 1, Direction.SOUTH);
        new Wall (naenae, 1, 1, Direction.NORTH);
        new Wall (naenae, 1, 1, Direction.WEST);
        
        new Wall (naenae, 1, 4, Direction.EAST);
        new Wall (naenae, 1, 4, Direction.SOUTH);
        new Wall (naenae, 1, 4, Direction.NORTH);
        new Wall (naenae, 1, 4, Direction.WEST);
        
        new Wall (naenae, 4, 4, Direction.EAST);
        new Wall (naenae, 4, 4, Direction.SOUTH);
        new Wall (naenae, 4, 4, Direction.NORTH);
        new Wall (naenae, 4, 4, Direction.WEST);
        
        new Wall (naenae, 4, 1, Direction.EAST);
        new Wall (naenae, 4, 1, Direction.SOUTH);
        new Wall (naenae, 4, 1, Direction.NORTH);
        new Wall (naenae, 4, 1, Direction.WEST);
        
        new Wall (naenae, 2, 2, Direction.NORTH);
        new Wall (naenae, 2, 2, Direction.WEST);
        new Wall (naenae, 2, 3, Direction.NORTH);
        new Wall (naenae, 2, 3, Direction.EAST);
        new Wall (naenae, 2, 3, Direction.NORTH);
        new Wall (naenae, 3, 3, Direction.EAST);
        new Wall (naenae, 3, 3, Direction.SOUTH);
        new Wall (naenae, 3, 2, Direction.SOUTH);
        new Wall (naenae, 3, 2, Direction.WEST);
        
        while (true){
            
            if (yeet.frontIsClear()) {
                yeet.move();
            }
            if (!yeet.frontIsClear()) {
                yeet.turnLeft();
                yeet.move();
                yeet.turnRight();
                yeet.move(2);
                yeet.turnRight();
                yeet.move(2);
                yeet.turnRight();
                yeet.move();
                yeet.turnLeft();
                
            }    
        }
        
        
                
              
    }
}
