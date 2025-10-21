package Lecture7_Swing;

import javax.swing.*;

public class Swing_Main {
    public static void main(String[] args) { //main method starts

        JFrame frame = new JFrame(); //create a JFrame object

        frame.setSize(500, 500); //set the width and height of the frame
        frame.setTitle("My Info"); //set the frame title
        frame.setLocationRelativeTo(null); //center the frame on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit program when frame is closed

        frame.setLayout(null); //set layout to null to manually position components

        JLabel label1 = new JLabel(); //create first label object
        label1.setText("Name: Saikat Talukder"); //set text of label1
        label1.setBounds(10,10,300,20); //set position and size of label1 (x, y, width, height)
        frame.add(label1); //add label1 to the frame

        JLabel label2 = new JLabel();
        label2.setText("ID: 241115051");
        label2.setBounds(10,30,300,20);
        frame.add(label2);

        JLabel label3 = new JLabel();
        label3.setText("Section: B");
        label3.setBounds(10, 50, 300, 20);
        frame.add(label3);

        JLabel label4 = new JLabel();
        label4.setText("Department: Computer Science & Engineering");
        label4.setBounds(10, 70, 300, 20);
        frame.add(label4);

        JLabel label5 = new JLabel();
        label5.setText("University: Metropolitan University");
        label5.setBounds(10, 90, 300, 20);
        frame.add(label5);

        frame.setVisible(true); //make the frame visible.
    }
}
