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

public class Part6 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        System.out.println("GraphicsPanel.paintComponent");
        int width = getWidth();
        int height = getHeight();

        int gradation = 10;
        int j = 0;

        for (int i = 5; i < 120; i += gradation) {
            j++;

            if (j % 2 == 0) {
                g.setColor(Color.BLUE);
            } else {
                g.setColor(Color.PINK);
            }
            g.drawOval((width / 2) - i, (height / 2) - i, i + i, i + i);
        }
    }
}
