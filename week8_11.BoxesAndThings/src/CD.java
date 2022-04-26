/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int yearPublished;
    private double weight;
    
    public CD(String cdArtist, String cdTitle, int cdYear) {
        this.weight = 0.1;
        this.artist = cdArtist;
        this.title = cdTitle;
        this.yearPublished = cdYear;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.yearPublished + ")";
    }
}
