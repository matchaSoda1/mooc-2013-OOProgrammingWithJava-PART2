
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JButton zeroButton;
    private Calculator calculator;
    private JTextField input;
    private JTextField output;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);

        output = new JTextField("0");
        output.setEnabled(false);
        input = new JTextField();

        container.add(output);
        container.add(input);
        container.add(createPanel(input, output), BorderLayout.SOUTH);
    }

    private JPanel createPanel(JTextField input, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        calculator = new Calculator();

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        zeroButton = new JButton("Z");

        //feed this GraphicCalculator user interface class into the listener
        //from there use the GraphicCalculator's getX() methods
        //makes the parameters(?) look so much cleaner
        addButton.addActionListener(new CalcListener(this,"add"));
        subtractButton.addActionListener(new CalcListener(this,"subtract"));
        zeroButton.addActionListener(new CalcListener(this, "zero"));
        zeroButton.setEnabled(false);
        
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(zeroButton);

        return panel;
    }

    public JButton getZeroButton() {
        //define as public method so that ActionListener can access it 
        //so that the zeroButton can be enabled and disabled
        //define zeroButton as class object first
        return zeroButton;
    }

    public Calculator getCalculator() {
        //define as public method so that ActionListener can access it
        //define calculator as class object first
        return calculator;
    }
   
    
    public JTextField getOutput(){
        return output;
    }
    
    public JTextField getInput(){
        return input;
    }

    public JFrame getFrame() {
        return frame;
    }
}
