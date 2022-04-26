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

public class PromissoryNote {

    private HashMap<String, Double> notes;

    public PromissoryNote() {
        this.notes = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.notes.put(cleanStr(toWhom), value);
    }

    public double howMuchIsTheDebt(String name) {
        if (this.notes.containsKey(cleanStr(name))) {
             double loan = notes.get(cleanStr(name));
             return loan;
        }
        return 0;
    }
    
    
    public String cleanStr(String str) {
        return str.trim().toLowerCase();
    }
}
