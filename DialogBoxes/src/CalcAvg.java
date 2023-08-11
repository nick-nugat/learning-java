/*
Nicholas Nguyen
2023-05-08
CalcAvg.java
Sell
Calculates the average of three numbers and returns a double
*/

import javax.swing.JOptionPane;

public class CalcAvg {
    public static void main(String[] args){
        int index = 1;
        int count = 0;
        while (index <= 3){
            String score1 = JOptionPane.showInputDialog(null, "Test Score: " + index);
            index++;
            count += Integer.parseInt(score1);
        }
        JOptionPane.showMessageDialog(null, "The average is: " + (double) count/3);
        
    }
}
