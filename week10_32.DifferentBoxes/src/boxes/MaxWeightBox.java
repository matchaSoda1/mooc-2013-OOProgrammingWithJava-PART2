/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author junen
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private Collection<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int weightOfThings = 0;

        for (Thing t : this.things) {
            weightOfThings += t.getWeight();
        }
        System.out.println("item to be added: " + thing.getName());
        System.out.println("is weight exceeded: " + (weightOfThings + thing.getWeight() <= maxWeight));
        if ((weightOfThings + thing.getWeight()) <= maxWeight) {
            things.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }

}
