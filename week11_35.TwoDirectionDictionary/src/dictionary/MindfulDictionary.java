/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 *
 * @author junen
 */
public class MindfulDictionary {

    private Map<String, String> dict;
    private String fileName = "";

    public MindfulDictionary(String file) {
        this.fileName = file;
        this.dict = new HashMap<String, String>();
    }

    public MindfulDictionary() {
        this("");
    }

    public boolean save() {
        
        try {
            FileWriter writer = new FileWriter(this.fileName);
            for (String key : this.dict.keySet()) {
                writer.write(key + ":" + this.dict.get(key) + "\n");
            }
            writer.close();
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    public boolean load() {
        boolean load = true;

        try {
            Scanner reader = new Scanner(new File(this.fileName));
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");

                this.dict.put(parts[0], parts[1]);
            }
        } catch (Exception e) {
            load = false;
        }
        return load;
    }

    public void add(String word, String translation) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, translation);
        }
    }

    public String translate(String word) {
        String found = "";

        if (this.dict.keySet().contains(word)) {
            found = this.dict.get(word);
        } else if (this.dict.values().contains(word)) {
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    found = key;
                }
            }
        } else {
            return null;
        }
        return found;
    }

    public void remove(String word) {

        String keyToRemove = "";

        if (this.dict.keySet().contains(word)) {
            keyToRemove = word;
        } else if (this.dict.values().contains(word)) {
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    keyToRemove = key;
                }
            }
        }

        if (!keyToRemove.isEmpty()) {
            this.dict.remove(keyToRemove);
        }

    }
}
