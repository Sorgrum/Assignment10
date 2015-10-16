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

public class Part1 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("GraphicsPanel.paintComponent");
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.red);

        // Top Line
        g.drawLine(0, 0, width, 0);

        // Left Line
        g.drawLine(0, 0, 0, height);

        // Bototm Line
        g.drawLine(0, height, width, height);

        // Right Line
        g.drawLine(width, 0, width, height);

        g.setColor(Color.green);
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);

        g.setColor(Color.blue);
        g.drawLine(width / 2, 0, width / 2, height);
        g.drawLine(0, height / 2, width, height / 2);
    }
}