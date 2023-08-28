import javax.swing.*;
import java.awt.event.*;

public class KiloConverter extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;

    private class CalcButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            final double CONVERSION = 0.6214;
            String input;
            double miles;
    
            //get text entered by the user into the text field
            input = kiloTextField.getText();
    
            //convert input to miles
            miles = Double.parseDouble(input) * CONVERSION;
    
            //display result
            JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");
        }
    }



    public KiloConverter(){
        super("Kilometer Converter");

        //set size of window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //what happens when close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //build panel and add to frame
        buildPanel();

        //add panel to frame's content pane
        add(panel);

        //display the window
        setVisible(true);
    }

    private void buildPanel(){
        //create label to display instructions
        messageLabel = new JLabel("Enter a distance " + "in kilometers");

        //create a text field 10 characters wide
        kiloTextField = new JTextField(10);

        //create a button with the caption "Calculate".
        calcButton = new JButton("Calculate");

        //add acgtion listener to button
        calcButton.addActionListener(new CalcButtonListener());

        //create JPanel object and let the panel field reference it
        panel = new JPanel();

        //add label, text field, and button components to panel
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
        public static void main(String[] args){
            new KiloConverter();
        }

}

