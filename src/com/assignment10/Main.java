package com.assignment10;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("[1-6] Which part do you want to see? ");
        int frameToShow = input.nextInt();

        // Part 1
        switch (frameToShow) {
            // No point in creating the frame or panel unless it is going to be seen
            case 1:
                JFrame part1Frame = new JFrame("Part 1");
                Part1 panelPart1 = new Part1();
                part1Frame.add(panelPart1);

                part1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                part1Frame.setSize(512, 512);
                part1Frame.setVisible(true);
                break;
            case 2:
                JFrame part2Frame = new JFrame("Part 2");
                Part2 panelPart2 = new Part2();
                part2Frame.add(panelPart2);

                part2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                part2Frame.setSize(512, 512);
                part2Frame.setVisible(true);
                break;
        }
    }
}
