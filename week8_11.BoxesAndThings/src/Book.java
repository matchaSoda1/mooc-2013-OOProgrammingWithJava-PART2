/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
public class Book implements ToBeStored {

    private String author;
    private String title;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.title = name;
        this.weight = weight;

    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.author + ": " + this.title;
    }
}
