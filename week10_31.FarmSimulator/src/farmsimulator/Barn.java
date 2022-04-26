/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author junen
 */
public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (this.robot == null) {
            throw new IllegalStateException("No Milking Robot has been installed");
        } else {
            this.robot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        //ArrayLists and LinkedList use the Collection interface so this method can accept either one
        if (this.robot == null) {
            throw new IllegalStateException("No Milking Robot has been installed");
        } else {
            for (Cow cow : cows) {
                this.robot.milk(cow);
            }
        }
    }

    public String toString() {
        return this.tank.toString();
    }
}
