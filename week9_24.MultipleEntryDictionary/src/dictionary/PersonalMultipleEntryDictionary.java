/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author junen
 */
import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;
    
    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String,Set<String>>();
    }
    public void add(String word, String entry) {
        if (!this.dictionary.containsKey(word)) {
        this.dictionary.put(word, new HashSet<String>());
        } 
        this.dictionary.get(word).add(entry);
    }
    public void remove(String word) {
        this.dictionary.remove(word);
    }
    
    public Set<String> translate(String word) {

        return this.dictionary.get(word);
        
    }
}
