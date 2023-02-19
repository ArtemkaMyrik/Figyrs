package com.example;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Circle extends Shape{
    int x;
    int y;
    public void draw() {
        new Dimension(320, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
                g2.draw(circle);
            }
        };
        setTitle("My Shapes");
        this.getContentPane().add(p);
    }
}
