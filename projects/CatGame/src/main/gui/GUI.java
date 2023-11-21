//package main.gui;
//
//
//import javax.swing.*;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GUI implements ActionListener {
//	private int counter = 0;
//	private JLabel label;
//	private JFrame frame;
//	private JPanel panel;
//	private JButton button;
//
//	public GUI(){
//		frame = new JFrame(); //frame object
//		panel = new JPanel(); //panel object
//		button = new JButton("Click me");
//		button.addActionListener(this);
//		label = new JLabel("Number of clicks: 0");
//
//		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //in pixels
//		panel.setLayout(new GridLayout(0, 1)); //sets layout to a grid layout (rows 0, cols 1)
//
//		panel.add(button); //adds button
//		panel.add(label); //adds label
//
//		frame.add(panel, BorderLayout.CENTER);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Our GUI");
//		frame.pack();
//		frame.setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		GUI gui = new GUI();
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		counter++;
//		label.setText("Number of clicks: " + counter);
//
//	}
//}
