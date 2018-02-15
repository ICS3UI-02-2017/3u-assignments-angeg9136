/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pkg11.assignments;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author angeg9136
 */
public class conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bigFat = new City();
        
        RobotSE teezy = new RobotSE (bigFat, 2, 1, Direction.EAST);
        
        new Wall (bigFat, 2, 5, Direction.EAST);
        
        //move until front is not clear
        while(teezy.frontIsClear()){
              
        //if front is clear, do this
        teezy.move();
    }
        
        //when front is not clear
        
        //
    }
    }
}
