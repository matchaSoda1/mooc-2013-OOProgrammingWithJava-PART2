
import java.util.*;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer p = new Printer("src/textfile.txt");
        p.printLinesWhichContain("Väinämöinen");
        p.printLinesWhichContain("on");

    }
}
