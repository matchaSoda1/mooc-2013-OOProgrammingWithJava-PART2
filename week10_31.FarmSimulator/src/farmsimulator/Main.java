package farmsimulator;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> test = new ArrayList<Double>();
        
        double number = 0.0;
        for (int i = 0; i<10; i++){
            number = 0.7 + (1.3 *new Random().nextDouble());
            
            System.out.println(String.format("%.1f",number));
        }
        
        System.out.println(Collections.min(test));
        System.out.println(Collections.max(test));
        
        
    }
}
