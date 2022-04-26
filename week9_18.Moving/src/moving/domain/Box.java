/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author junen
 */
import java.util.*;

public class Box implements Thing {

    private int maxVolume;
    private List<Thing> things;

    public Box(int maxCapacity) {
        this.maxVolume = maxCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maxVolume) {
            things.add(thing);
            return true;
        }
        return false;
    }

    public int getVolume() {
        int totalVolume = 0;
        for (Thing t : this.things) {
            totalVolume += t.getVolume();
        }
        return totalVolume;
    }
    
    public String toString() {
        String str = "";
        for (Thing thing: this.things) {
            str+="thing in the box: " + thing + "\n";
        }
        return str;
    }
}
