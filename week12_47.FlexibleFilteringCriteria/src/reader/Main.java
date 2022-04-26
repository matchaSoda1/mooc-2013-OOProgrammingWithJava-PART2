package reader;

import reader.criteria.*;

public class Main {

    public static void main(String[] args) {
//        String address = "https://www.gutenberg.org/files/2554/2554-0.txt";
//        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new Not(new ContainsWord("java"));
        
        System.out.println(criterion.complies(""));

        
    }
}
