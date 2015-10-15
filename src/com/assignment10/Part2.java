package com.assignment10;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Part2 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("GraphicsPanel.paintComponent");
        int width = getWidth();
        int height = getHeight();

        int gradation = height / 14;

        g.drawLine(0, 0, 0, height);
        for (int i = 0; i <= width; i += gradation) {
            System.out.println(i);
            g.drawLine(0, 0, i, width - i);
        }
    }
}