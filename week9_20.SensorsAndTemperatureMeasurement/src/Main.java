
import java.util.*;
import application.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        AverageSensor av = new AverageSensor();
        
        ConstantSensor one = new ConstantSensor(1);
        ConstantSensor ten = new ConstantSensor(10);
        
        System.out.println(one.measure());
        
        av.addSensor(ten);
        av.addSensor(one);
        
        System.out.println(av.measure());
    }
}
