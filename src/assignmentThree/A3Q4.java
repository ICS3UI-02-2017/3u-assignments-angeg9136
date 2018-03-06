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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for yoozy the robot 
        City momoTown = new City();
        
        //create the robot
        RobotSE yoozy = new RobotSE (momoTown, 3, 3, Direction.SOUTH);
        
        //create the squares for the city
        new Wall (momoTown, 1, 1, Direction.NORTH);
        new Wall (momoTown, 1, 1, Direction.WEST);
        new Wall (momoTown, 1, 2, Direction.NORTH);
        new Wall (momoTown, 1, 2, Direction.EAST);
        new Wall (momoTown, 2, 1, Direction.WEST);
        new Wall (momoTown, 2, 1, Direction.SOUTH);
        new Wall (momoTown, 2, 2, Direction.EAST);
        new Wall (momoTown, 2, 2, Direction.SOUTH);
        
        new Wall (momoTown, 1, 4, Direction.WEST);
        new Wall (momoTown, 1, 4, Direction.NORTH);
        new Wall (momoTown, 2, 4, Direction.WEST);
        new Wall (momoTown, 2, 4, Direction.SOUTH);
        new Wall (momoTown, 2, 5, Direction.EAST);
        new Wall (momoTown, 2, 5, Direction.SOUTH);
        new Wall (momoTown, 1, 5, Direction.EAST);
        new Wall (momoTown, 1, 5, Direction.NORTH);
        
        new Wall (momoTown, 4, 1, Direction.WEST);
        new Wall (momoTown, 4, 1, Direction.NORTH);
        new Wall (momoTown, 4, 2, Direction.EAST);
        new Wall (momoTown, 4, 2, Direction.NORTH);
        new Wall (momoTown, 5, 1, Direction.SOUTH);
        new Wall (momoTown, 5, 1, Direction.WEST);
        new Wall (momoTown, 5, 2, Direction.SOUTH);
        new Wall (momoTown, 5, 2, Direction.EAST);
        
        new Wall (momoTown, 4, 4, Direction.NORTH);
        new Wall (momoTown, 4, 4, Direction.WEST);
        new Wall (momoTown, 4, 5, Direction.NORTH);
        new Wall (momoTown, 4, 5, Direction.EAST);
        new Wall (momoTown, 5, 4, Direction.WEST);
        new Wall (momoTown, 5, 4, Direction.SOUTH);
        new Wall (momoTown, 5, 5, Direction.EAST);
        new Wall (momoTown, 5, 5, Direction.SOUTH);
        
        //make him move around the city squares
        int numberOfRotations =4;
          while (numberOfRotations > 0){            
            yoozy.move(3);
            
            yoozy.turnLeft();
            
            yoozy.move(3);
            
            yoozy.turnLeft();
            
            yoozy.move(3);
            
            yoozy.turnLeft();
            
            yoozy.move(3);
            
            numberOfRotations = numberOfRotations - 1;
        
    }
}
