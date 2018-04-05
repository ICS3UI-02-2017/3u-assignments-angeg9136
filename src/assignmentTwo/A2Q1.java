/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author angeg9136
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for monmo

        City q = new City();

        //put a robot in q

        RobotSE monmo = new RobotSE(q, 1, 1, Direction.EAST);

        new Thing(q, 1, 2);
        new Thing(q, 1, 3);
        new Thing(q, 1, 4);
        new Thing(q, 1, 5);
        new Thing(q, 1, 6);
        new Thing(q, 1, 7);
        new Thing(q, 1, 8);
        new Thing(q, 1, 9);
        new Thing(q, 1, 10);
        new Thing(q, 1, 11);

        while (monmo.getAvenue() != 12) {
            monmo.move();
            if (monmo.countThingsInBackpack() < 7) {
                monmo.pickThing();
            } else {
                if (monmo.countThingsInBackpack() >7) {
                        
               
                



            }




        }


    }

}
}