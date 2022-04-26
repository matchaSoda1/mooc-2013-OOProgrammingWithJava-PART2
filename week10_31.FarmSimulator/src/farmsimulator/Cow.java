/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author junen
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double udderCapacity;
    private double milkAmount;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26); //generates a number between 15 and 40 
        this.milkAmount = 0.0;                                                //(add 1 to nextInt parameter)
    }

    public Cow() {
        this(NAMES[new Random().nextInt(31)]);
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        return this.milkAmount;
    }

    public void liveHour() {
        double randMilk = 0.7 + (1.3 * new Random().nextDouble());
        if (this.milkAmount + randMilk <= this.udderCapacity) {
            this.milkAmount += randMilk;
        } else {
            this.milkAmount = this.udderCapacity;
        }
    }

    public double milk() {
        double milked = this.milkAmount;
        this.milkAmount = 0;
        return milked;
    }

    public String toString() {
        return this.name + " " +Math.ceil(this.milkAmount) +"/" + Math.ceil(this.udderCapacity);
    }
}
