/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcListener implements ActionListener {

    private Calculator calc;
    private JTextField input;
    private JTextField output;
    private String operation;
    private GraphicCalculator ui;
    private JButton zeroButton;

    public CalcListener(GraphicCalculator ui, String operation) {
        this.ui = ui;
        this.operation = operation;
        this.calc = ui.getCalculator();
        this.input = ui.getInput();
        this.output = ui.getOutput();
        this.zeroButton = ui.getZeroButton();
    }

    public void actionPerformed(ActionEvent ae) {

        if (this.isInteger(this.input.getText())) {

            if (this.operation.equals("add")) {
                this.calc.add(Integer.parseInt(input.getText()));
            } else if (this.operation.equals("subtract")) {
                this.calc.subtract(Integer.parseInt(input.getText()));
            } else if (this.operation.equals("zero")) {
                this.calc.zero();
            }
        }
        
        this.output.setText("" + this.calc.getValue());
        this.input.setText("");

        if (this.calc.getValue() != 0) {
            this.zeroButton.setEnabled(true);
        } else {
            this.zeroButton.setEnabled(false);
        }
    }

    public boolean isInteger(String input) {
        try {
            int integer = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
