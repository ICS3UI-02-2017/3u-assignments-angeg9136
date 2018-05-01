/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class A3Q1 {
    private static int numberOfRotaions;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for depresso the robot
        
        City l = new City();
        
        //create the robot
        RobotSE depresso = new RobotSE (l, 0, 2, Direction.WEST);
        new Wall (l, 1, 1, Direction.WEST);
        new Wall (l, 1, 1, Direction.NORTH);
        new Wall (l, 1, 2, Direction.EAST);
        new Wall (l, 1, 2, Direction.NORTH);
        new Wall (l, 2, 1, Direction.WEST);
        new Wall (l, 2, 1, Direction.SOUTH);
        new Wall (l, 2, 2, Direction.SOUTH);
        new Wall (l, 2, 2, Direction.EAST);
        
        // create the integer soo he only goes around twice
        int rotations =2;
        
        //make depresso move around and stop at 2 rotations
        while(rotations > 0) {
            depresso.move(2);
            depresso.turnLeft();
            depresso.move(3);
            depresso.turnLeft();
            depresso.move();
            depresso.move(2);
            depresso.turnLeft();
            depresso.move(3);
            depresso.turnLeft();
            depresso.move();
            
         //take away a rotation once 1 is completed
         rotations = rotations -1;}
        
        
        
    }
}
