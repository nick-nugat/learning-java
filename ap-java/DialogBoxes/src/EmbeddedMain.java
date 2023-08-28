import javax.swing.*;

public class EmbeddedMain extends JFrame{
    public EmbeddedMain(){
        //calls the parent JFrame constructor
        super("A Simple Window");

        //constants for window dimensions
        final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;

        //set size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify what happens when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display the window
        setVisible(true);

    }

    public static void main(String[] args){
        EmbeddedMain firstWindow = new EmbeddedMain();
    }
}