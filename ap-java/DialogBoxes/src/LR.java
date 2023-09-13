import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LR extends JFrame {
    private JButton left, right;
    private JLabel label, clicks;
    private int numClicks = 0;
    private JPanel buttonPanel;
    private final int WINDOW_WIDTH = 520;
    private final int WINDOW_HEIGHT = 300;

    public LR(){
        //JFrame constructor
        super("Left Right With Counter");
        //set size of window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //buildPanel();
        //add(panel);

        left = new JButton("Left");
        right = new JButton("Right");
        label = new JLabel("Push a button:");
        clicks = new JLabel("Number of clicks: " + numClicks);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(300,80));
        //buttonPanel.setBackground(Color.blue);
        buttonPanel.add(label);
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(clicks);

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
            numClicks++;
            if (event.getSource() == left){
                label.setText("Left");
            }
            else{
                label.setText("Right");
            }
            clicks.setText("Number of clicks: " + numClicks);
        }
}
public static void main(String[] args){
    LR trialWindow = new LR();
    }
}
