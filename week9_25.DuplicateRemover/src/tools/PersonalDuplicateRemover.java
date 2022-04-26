/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author junen
 */
import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> list;
    private List<String> duplicateList;

    public PersonalDuplicateRemover() {
        this.list = new HashSet<String>();
        this.duplicateList = new ArrayList<String>();
    }

    public void add(String characterString) {
        if (this.list.contains(characterString)) {
            this.duplicateList.add(characterString);
        } else {
            this.list.add(characterString);
        }
    }

    public int getNumberOfDetectedDuplicates() {
        return this.duplicateList.size();
    }
    
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }
    
    public void empty() {
        this.list.clear();
        this.duplicateList.clear();
    }
}
