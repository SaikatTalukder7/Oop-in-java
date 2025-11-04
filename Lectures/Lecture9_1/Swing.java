package Lecture9_1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Swing {

	public static void main(String[] args) {


		JFrame frame = new JFrame();
		frame.setTitle("Info");
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("img/Sosuke Aizen.png");
		
		Image image = icon1.getImage();
		Image newImage = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(newImage);		
		
		JLabel lbl1 = new JLabel();
		lbl1.setBounds(0, 0, 500, 500);
		lbl1.setIcon(resizedIcon);
		frame.add(lbl1);
		
		JRadioButton btn1 = new JRadioButton("Sosuke Aizen");
		btn1.setBounds(20, 550, 150, 30);
		frame.add(btn1);
		
		JRadioButton btn2 = new JRadioButton("Uchiha Itachi");
		btn2.setBounds(20, 580, 150, 30);
		frame.add(btn2);
		
		JRadioButton btn3 = new JRadioButton("Saikat Talukder");
		btn3.setBounds(20, 610, 150, 30);
		frame.add(btn3);
		
		JRadioButton btn4 = new JRadioButton("Uzumaki Naruto");
		btn4.setBounds(20, 640, 150, 30);
		frame.add(btn4);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(btn1);
		bg1.add(btn2);
		bg1.add(btn3);
		bg1.add(btn4);
		
		JButton btn1_1 = new JButton("Check");
		btn1_1.setBounds(30, 680, 100, 20);
		btn1_1.setBackground(Color.GRAY);
		btn1_1.setForeground(Color.WHITE);
		frame.add(btn1_1);
		
		btn1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if(btn1.isSelected()) {
					
					JOptionPane.showMessageDialog(frame, "The option is Correct");
				}
				else{
					
					JOptionPane.showMessageDialog(frame, "The option is incorrect");
				}
			}
		}
		);

		frame.setVisible(true);

	}

}
