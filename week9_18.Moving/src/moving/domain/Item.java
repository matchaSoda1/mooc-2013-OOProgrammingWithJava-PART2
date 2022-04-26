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
public class Item implements Thing, Comparable<Item>{
    private String itemName;
    private int itemVolume;
    
    public Item(String name, int volume) {
        this.itemName = name;
        this.itemVolume = volume;
    }
    
    public String getName() {
        return this.itemName;
    }
    
    public String toString() {
        return this.itemName + " (" + this.getVolume() + " dm^3)";
    }
    
    public int getVolume(){
        return this.itemVolume;
    }
    
    public int compareTo(Item item) {
        return this.itemVolume - item.getVolume();
    }
}
