/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
public class Calculator {
    private Reader r;
    private int stats;
    
    public Calculator() {
        this.r = new Reader();
        this.stats = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = r.readString();
            
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        
        statistics();
    }
    
    private void statistics() {
        System.out.println("Calculations done " + stats);
    }
    
    private void sum() {
        
        int val1 = readVal1();
        int val2 = readVal2();
        System.out.println("sum of values: " + (val1 + val2));
        stats++;
    }
    
    private void difference() {
        
        int val1 = readVal1();
        int val2 = readVal2();
        System.out.println("difference of values: " + (val1 - val2));
        stats++;
    }
    
    private void product() {
        
        int val1 = readVal1();
        int val2 = readVal2();
        System.out.println("product of values: " + (val1 * val2));
        stats++;
    }

    private int readVal1() {
        System.out.println("value1: ");
        return r.readInteger();

    }

    private int readVal2() {
        System.out.println("value2: ");
        return r.readInteger();

    }
    
    
}
