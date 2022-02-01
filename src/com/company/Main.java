package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input, dir;
        Field playField = new Field();
        Player player1 = new Player();
        Scanner sc = new Scanner(System.in);

        do {
            playField.printField();
            System.out.println("Enter your next action! (W: move forward, A: turn left, D: turn right, X: exit program)");
            input = sc.next();
            if(input.equals("w")) {
                playField.move();
                System.out.println("You move forward...");
                System.out.println();
            } else if(input.equals("a")) {
                player1.left();
                dir = player1.getDir();
                playField.setDir(dir);
                System.out.println("You turn left...");
                System.out.println();
            } else if(input.equals("d")) {
                player1.right();
                dir = player1.getDir();
                playField.setDir(dir);
                System.out.println("You turn right...");
                System.out.println();
            } else if(input.equals("x")) {
                System.out.println("Exiting program...");
                System.out.println();
            } else {
                System.out.println("ERROR: Invalid input!");
                System.out.println();
            }
        } while(!input.equals("x"));
    }
}
