/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author junen
 */
public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double maxVal = 0;
        if (!this.history.isEmpty()) {
            for (Double d : this.history) {
                if (d > maxVal) {
                    maxVal = d;
                }
            }
            return maxVal;
        }
        return 0;
    }

    public double minValue() {
        double minVal = this.maxValue();
        if (!this.history.isEmpty()) {
            for (Double d : this.history) {
                if (d < minVal) {
                    minVal = d;
                }
            }
            return minVal;
        }
        return 0;
    }

    public double average() {
        double average = 0.0;

        for (Double d : this.history) {
            average += d;
        }

        average /= this.history.size();

        return average;
    }

    public double greatestFluctuation() {
        double maxFluctuation = 0.0;
        double fluctuation = 0.0;
        
        
        for (int i = 0; i<this.history.size()-1; i++) {
            fluctuation = Math.abs(this.history.get(i+1) - this.history.get(i));
            if (fluctuation > maxFluctuation) {
                maxFluctuation = fluctuation;
            }
        }
        return maxFluctuation;
    }

    public double variance() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        double varianceSum = 0;
        for (double d : this.history) {
            varianceSum+= Math.pow(d-this.average(), 2);
        }
        System.out.println(varianceSum/(this.history.size()-1));
        return varianceSum/(this.history.size()-1);
    }
}
