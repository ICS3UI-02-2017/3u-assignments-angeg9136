/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author angeg9136
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for juiceBox the robot
        
        City oof = new City();
        RobotSE juiceBox = new RobotSE (oof, 1, 1, Direction.EAST);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        new Thing (oof, 1, 1);
        oof.showThingCounts(true);
        
        //create int to store juicebox's moves
        int moves = 10;
        //make him move until everything is done
        while(moves >0){
            juiceBox.pickThing();
            juiceBox.move();
            juiceBox.putThing();
            juiceBox.turnAround();
            juiceBox.move();
            juiceBox.turnAround();
            //lose a move once a thing is dropped
            moves = moves -1;
        }
        
        //move onto pile
        juiceBox.move();
            
    }
            
        }
        
        
        
    
