package dictionary;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Test your dictionary here

        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));

        dict.add("pineapple", "ananas");
        
        dict.save();
        
                
                
    }
}
