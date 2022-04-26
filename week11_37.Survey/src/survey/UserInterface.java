package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(250,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS); //UI Layout manager - one of many
        container.setLayout(layout);
        

        container.add(new JLabel("Are you?"));       
        
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        
        container.add(new JLabel("Why?"));
        
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(fun);
        
        container.add(noReason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
