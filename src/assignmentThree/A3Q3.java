/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author angeg9136
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for thiccBoy the robot
        
        
        City oofVille = new City();
       
        //create the robot
        RobotSE thiccBoy = new RobotSE(oofVille, 1, 1, Direction.EAST,20);
        
        //create int for seeds
        int seeds = 20;
        //while he has more than 0 seeds make him plant
        while(seeds > 0){
            if (!thiccBoy.canPickThing());{
            //plant seeds
            thiccBoy.putThing();
            thiccBoy.move();
            //take away a seed after he plants one so he only plants 20
            seeds = seeds -1;}
            
        //make him turn when needed  
        if (thiccBoy.getAvenue() ==5){
            thiccBoy.turnRight();}
        
        //make him turn left when needed
        if (thiccBoy.getAvenue() ==1){
            thiccBoy.turnLeft();}    
            }        
        }
    }

