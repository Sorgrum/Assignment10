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
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("[1-6] Which part do you want to see? ");
        int frameToShow = input.nextInt();

        // Part 1
        switch (frameToShow) {
            // No point in creating the frame or panel unless it is going to be seen
            // Question: Should I create the panel and just not make it visible until it needs to be shown so it is
            // faster? It seems like it would make the initial run time longer but would make everything snappier
            // once it's loaded
            case 1:
                JFrame part1Frame = new JFrame("Part 1");
                Part1 panelPart1 = new Part1();
                part1Frame.add(panelPart1);

                part1Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part1Frame.setSize(512, 512);
                part1Frame.setVisible(true);
                break;
            case 2:
                JFrame part2Frame = new JFrame("Part 2");
                Part2 panelPart2 = new Part2();
                part2Frame.add(panelPart2);

                part2Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part2Frame.setSize(512, 512);
                part2Frame.setVisible(true);
                break;
            case 3:
                JFrame part3Frame = new JFrame("Part 3");
                Part3 panelPart3 = new Part3();
                part3Frame.add(panelPart3);

                part3Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part3Frame.setSize(512, 512);
                part3Frame.setVisible(true);
                break;
            case 4:
                JFrame part4Frame = new JFrame("Part 4");
                Part4 panelPart4 = new Part4();
                part4Frame.add(panelPart4);

                part4Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part4Frame.setSize(512, 512);
                part4Frame.setVisible(true);
                break;
            case 5:
                JFrame part5Frame = new JFrame("Part 5");
                Part5 panelPart5 = new Part5();
                part5Frame.add(panelPart5);

                part5Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part5Frame.setSize(512, 512);
                part5Frame.setVisible(true);
                break;
            case 6:
                JFrame part6Frame = new JFrame("Part 6");
                Part6 panelPart6 = new Part6();
                part6Frame.add(panelPart6);

                part6Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                part6Frame.setSize(256, 256);
                part6Frame.setVisible(true);
                break;
        }
    }
}
