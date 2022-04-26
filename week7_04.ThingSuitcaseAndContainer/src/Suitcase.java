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

public class Suitcase {

    private ArrayList<Thing> things;
    private final int WEIGHT_LIMIT;
    private int totalWeight;

    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.WEIGHT_LIMIT = weightLimit;
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if (totalWeight + thing.getWeight() <= this.WEIGHT_LIMIT) {
            things.add(thing);
            totalWeight += thing.getWeight();
        }

    }

    public void printThings() {
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i));
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Thing heaviestThing() {

        Thing heaviest = new Thing("heaviest thing", 0);

        if (things.isEmpty()) {
            heaviest = null;
        } else {
            for (Thing thing : things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
    }

    public String toString() {
        if (totalWeight == 0) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight + " kg)";
        }
        return things.size() + " things (" + totalWeight + " kg)";
    }
}
