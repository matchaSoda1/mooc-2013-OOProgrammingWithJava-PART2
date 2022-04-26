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

public class Container {

    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int weight) {
        this.maxWeight = weight;
        this.suitcases = new ArrayList<Suitcase>();
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }
    public void printThings() {
        for (int i = 0; i < suitcases.size(); i++) {
            suitcases.get(i).printThings();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
