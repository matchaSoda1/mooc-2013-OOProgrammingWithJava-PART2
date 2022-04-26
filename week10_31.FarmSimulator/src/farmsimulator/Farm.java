/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author junen
 */
public class Farm implements Alive {

    private String farmerName;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String farmerName, Barn barn) {
        this.farmerName = farmerName;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.farmerName;        
}

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    public void manageCows() {
        barn.takeCareOf(cows);
    }

    private String howManyCows() {

        if (this.cows.isEmpty()) {
            return "No cows.";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Animals: \n");

        String prefix = "";
        for (Cow cow : cows) {
            sb.append(prefix);
            prefix = "\n";
            sb.append("        ").append(cow.toString());
        }

        return sb.toString();

    }

    public String toString() {
        return "Farm owner: " + this.farmerName + "\n"
                + "Barn bulk tank: " + this.barn.getBulkTank() + "\n"
                + howManyCows();
    }

}
