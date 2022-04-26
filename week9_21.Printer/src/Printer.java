/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */

import java.util.*; //scanner
import java.io.File;

public class Printer {
    private File f;
    private Scanner reader;
    private List<String> lines;
    
    public Printer(String fileName) throws Exception {
        
        this.f = new File(fileName);
        this.reader = new Scanner(f, "UTF-8");
        this.lines = new ArrayList<String>();
        
        //not explained why you cannot do this in a method
        //but can in a constructor
        String line = "";
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            lines.add(line);
        }
    }
    
    public void printLinesWhichContain(String word) {

        for (String line : this.lines) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
