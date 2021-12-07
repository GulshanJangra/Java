package com.company;

import java.awt.*;
import java.awt.event.*;



class Main extends Frame
{
    TextField tf;
    TextField tf1;
    Button b1;
    Button b2;
    Main()
    {
        Frame f = new Frame("Authentication");


        tf = new TextField();
        tf.setBounds(90,80,170,20);
        Label l1 = new Label("E-mail");
        l1.setBounds(30,73,170,30);


        tf1 = new TextField();
        tf1.setBounds(90,110,170,20);
        Label l2 = new Label("Password");
        l2.setBounds(30,103,170,30);



        b1 = new Button("Login");
        b1.setBounds(100,140,80,30);
        b2 = new Button("Signup");
        b2.setBounds(100,180,80,30);

        f.add(tf);
        f.add(tf1);
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(l2);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setTitle("Gulshan Jangra");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}