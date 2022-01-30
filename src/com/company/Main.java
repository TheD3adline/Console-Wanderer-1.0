package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        Field playfield = new Field();
        Scanner sc = new Scanner(System.in);

        do {
            playfield.printField();
            System.out.println("Enter your next action (W: move forward, A: turn left, D: turn right, X: exit program)");
            input = sc.next();
            if(input.equals("w")) {

            } else if(input.equals("a")) {

            } else if(input.equals("d")) {

            } else if(input.equals("x")) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("ERROR: Invalid input!");
            }

        } while(!input.equals("x"));
    }
}
