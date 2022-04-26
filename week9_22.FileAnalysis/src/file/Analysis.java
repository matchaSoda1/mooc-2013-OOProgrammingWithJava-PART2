/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author junen
 */
import java.util.*;
import java.io.*;

public class Analysis {
    private Scanner reader;
    private File file;
    private List<String> lines;

    public Analysis(File file) throws Exception {
        this.lines = new ArrayList<String>();
        this.file = file;
        this.reader = new Scanner(this.file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line += "\n";
            lines.add(line);
        }
        reader.close();
    }

    public int lines() {
        return lines.size();
    }
    
    public int characters() {
        int characters = 0;
        for (String line: this.lines) {
            characters+=line.length();
        }
        return characters;
    }
}
