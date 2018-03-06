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
        
        //create the integer
        int numberOfSeeds = 20;
     
        while (numberOfSeeds > 0) {
            if(!thiccBoy.canPickThing()) {
                //take away one integer everytime a seed is picked
                thiccBoy.putThing();
                thiccBoy.move();
                numberOfSeeds = numberOfSeeds -1;
            }
          //make him turn when neccasary
            
            if (thiccBoy.getAvenue() ==5){
                thiccBoy.turnRight();
               
            }
            if (thiccBoy.getAvenue() ==1){
                thiccBoy.turnLeft();
            }
        }
        
        
        
    }
}
