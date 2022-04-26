
import java.io.*;
import java.util.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
//        FileManager t = new FileManager();
//
//        for (String line : t.read("src/testinput1.txt")) {
//            System.out.println(line);
//        }

        FileManager t = new FileManager();

        List<String> lines = new ArrayList<String>();
        lines = t.read("src/test.txt");
        
        System.out.println(lines);
        
        
    }

}
