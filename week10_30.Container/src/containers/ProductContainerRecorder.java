/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author junen
 */
public class ProductContainerRecorder extends ProductContainer {


    private ContainerHistory volumeHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.volumeHistory = new ContainerHistory();
        this.volumeHistory.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history() {
        return this.volumeHistory.toString();
    }
    
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.volumeHistory.add(this.getVolume());
        System.out.println(this.history());
    }
    
    public double takeFromTheContainer(double amount) {
        double remaining = super.takeFromTheContainer(amount);
        this.volumeHistory.add(this.getVolume());
        return remaining;
        
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.volumeHistory.toString() + "\n"
                + "Greatest product amount: " + this.volumeHistory.maxValue() + "\n"
                + "Smallest product amount: " + this.volumeHistory.minValue() + "\n"
                + "Average:  "+ this.volumeHistory.average() +"\n"
                + "Greatest change: " + this.volumeHistory.greatestFluctuation() + "\n"
                + "Variance: " + this.volumeHistory.variance());
    }
}
