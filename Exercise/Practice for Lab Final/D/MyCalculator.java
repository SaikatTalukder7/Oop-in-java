package D;

import javax.swing.*;
import java.awt.event.*;

public class MyCalculator extends JFrame {

    JTextField t1, t2, r;

    MyCalculator() {
        setLayout(null);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(20,20,100,30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(100,20,100,30);
        add(t1);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(20,60,100,30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(100,60,100,30);
        add(t2);

        JButton add = new JButton("ADD");
        add.setBounds(20,100,80,30);
        add(add);

        JButton sub = new JButton("Subtract");
        sub.setBounds(110,100,100,30);
        add(sub);

        JButton mul = new JButton("Multiply");
        mul.setBounds(220,100,100,30);
        add(mul);

        JButton div = new JButton("Divide");
        div.setBounds(330,100,100,30);
        add(div);

        JLabel Lr = new JLabel("Result:");
        Lr.setBounds(20,140,100,30);
        add(Lr);

        r = new JTextField();
        r.setBounds(80,140,100,30);
        add(r);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                r.setText(""+(a+b));
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                r.setText(""+(a-b));
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                r.setText(""+(a*b));
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                if(b!=0)
                    r.setText(""+(a/b));
                else
                    r.setText("0");
            }
        });

        setSize(500,250);
        setVisible(true);
    }

    public static void main(String[] args){
        new MyCalculator();
    }
}