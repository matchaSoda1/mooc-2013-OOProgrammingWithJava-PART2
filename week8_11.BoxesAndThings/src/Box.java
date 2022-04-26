/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
import java.util.*;

public class Box implements ToBeStored {

    private final double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        
        if (this.weight() + thing.weight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public double weight() {
        //weight of the contents of the box - not the max weight...
        
        double contentsWeight = 0;
        
        for (ToBeStored thing : this.things) {
            contentsWeight+= thing.weight();
        }
        
        return contentsWeight;
    }
    
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + this.weight() + " kg";
    }
}
