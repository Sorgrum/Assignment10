package com.assignment10;

/*
*
* Student Name: Marcelo Gheiler
* Date: 2015-10-16
* TA Name: Colin Pronovost
* Assignment: 10
* Lab Day: Monday
* Lab Time: 5PM
* Lab Location: CSB 703
*
* I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own.
*
*/

import javax.swing.*;
import java.awt.*;

public class Part3 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("GraphicsPanel.paintComponent");
        int width = getWidth();
        int height = getHeight();

        int gradation = height / 15;

        g.drawLine(0, 0, 0, height);
        for (int i = 0; i <= width; i += gradation) {
            g.drawLine(0, 0, i, width - i);
            g.drawLine(0, height, width - i, width - i);
            g.drawLine(width, 0, i, i);
            g.drawLine(width, height, i, width - i);
        }
    }
}