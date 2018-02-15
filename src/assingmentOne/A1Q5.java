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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for fat the robot
        
        City o = new City();
        
        //put a robot in o
        
        RobotSE fat = new RobotSE (o, 0, 1,Direction.WEST);
        
        RobotSE thicc = new RobotSE (o, 3, 3,Direction.EAST);
        
        thicc.setLabel("thicc");
        
        fat.setLabel("fat");
        
        new Wall (o, 2, 3,Direction.NORTH);
        
        new Wall (o, 2, 3,Direction.EAST);
        
        new Wall (o, 2, 3,Direction.WEST);
        
        new Wall (o, 3, 3,Direction.SOUTH);
        
        new Wall (o, 3, 3,Direction.EAST);
        
        new Thing (o, 0, 0);
        
        new Thing (o, 1, 1);
        
        new Thing (o, 1, 2);
        
        new Thing (o, 2, 2);
        
        new Thing (o, 1, 0);
        
        fat.move();
        
        fat.pickThing();
        
        fat.turnLeft();
        
        fat.move();
        
        fat.pickThing();
        
        fat.turnLeft();
        
        thicc.turnRight(2);
        
        thicc.move();
        
        thicc.turnRight();
        
        thicc.move();
        
        thicc.pickThing();
        
        thicc.move();
        
        thicc.pickThing();
        
        thicc.turnLeft();
        
        fat.move();
        
        fat.pickThing();
        
        
        
        
        
        
    }
}
