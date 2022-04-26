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

    private int initNumber;

    public Calculator() {
        this.initNumber = 0;
    }

    public void add(int number) {
        this.initNumber += number;
    }
    
    public void subtract(int number){
        this.initNumber-= number;
    }
    
    public void zero() {
        this.initNumber = 0;
    }
    
    public int getValue(){
        return this.initNumber;
    }
}
