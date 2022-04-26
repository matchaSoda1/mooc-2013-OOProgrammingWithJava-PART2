/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionListener;
import clicker.applicationlogic.*;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
/**
 *
 * @author junen
 */
public class ClickListener implements ActionListener {
//Implement the class ClickListener in the package clicker.ui; the class 
//implements the interface ActionListener.ClickListener which receives two 
//objects as constructor parameters: an object which implements the 
//interface Calculator and a JLabel object.
    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calc, JLabel label){
        this.calc = calc;
        this.label = label;
    }
    
    @Override 
    public void actionPerformed(ActionEvent ae) {
        this.calc.increase();
        this.label.setText("" + this.calc.giveValue());
    }
//
//Implement the actionPerformed method so that the Calculator object increases 
//    by one at first, and after it, the calculator value is set as text of the 
//            JLabel object. The text of the JLabel object can be modified with 
//                    the method setText.
}
