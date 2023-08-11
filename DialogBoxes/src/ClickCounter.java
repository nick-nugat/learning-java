import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickCounter extends JFrame {
    private JButton left, right;
    private JLabel clicks;
    private int numClicks = 0;
    private JPanel buttonPanel;
    private final int WINDOW_WIDTH = 520;
    private final int WINDOW_HEIGHT = 300;

    public ClickCounter(){
        //JFrame constructor
        super("Add One or Subtract One");
        //set size of window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //buildPanel();
        //add(panel);

        left = new JButton("Add One");
        right = new JButton("Subtract One");
        clicks = new JLabel("" + numClicks);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(300,80));
        buttonPanel.add(left);
        buttonPanel.add(clicks);
        buttonPanel.add(right);

        setPreferredSize(new Dimension(200,80));
        setBackground(Color.cyan);
        //add(label);
        add(buttonPanel);
        //add(clicks);

        ButtonListener listener = new ButtonListener();
        left.addActionListener(listener);
        right.addActionListener(listener);

        //display window
        setVisible(true);
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == left){
                numClicks++;
                buttonPanel.setBackground(Color.green);
            }
            else{
                numClicks--;
                buttonPanel.setBackground(Color.red);
            }
            clicks.setText("" + numClicks);
        }
}
public static void main(String[] args){
    ClickCounter trialWindow = new ClickCounter();
    }
}
