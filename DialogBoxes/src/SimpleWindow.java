/*
Nicholas Nguyen
2023-05-10
SimpleWindow.java
Displays a simple window with title. Closes when user clicks the close button.
*/

import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args){
        final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;

        //create window with title
        JFrame window = new JFrame("A Simple Window");
        
        //set size of window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify what happens when close button is clicked
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display window
        window.setVisible(true);
    }

}
