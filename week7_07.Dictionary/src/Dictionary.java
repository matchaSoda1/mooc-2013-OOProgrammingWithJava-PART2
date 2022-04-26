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

public class Dictionary {
    private HashMap<String,String> dictionary;
    
    public Dictionary() {
        this.dictionary = new HashMap<String,String>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
        
    }
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translList = new ArrayList<String>();
        
        for (String key: this.dictionary.keySet()) {
            translList.add(key + " = " + this.dictionary.get(key));
        }
        
        return translList;
    }
}
