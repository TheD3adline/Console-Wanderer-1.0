package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        String newDir = ">";
        int newxPos = 1;
        int newyPos = 1;
        Field playField = new Field();
        Player player1 = new Player();
        Scanner sc = new Scanner(System.in);

        do {
            playField.printField();
            System.out.println("Enter your next action (W: move forward, A: turn left, D: turn right, X: exit program)");
            input = sc.next();
            if(input.equals("w")) {
                player1.fwd();
                newxPos = player1.getxPos();
                newyPos = player1.getyPos();
                playField.move(newDir, newxPos, newyPos);
            } else if(input.equals("a")) {
                player1.left();
                newDir = player1.getDir();
                playField.move(newDir, newxPos, newyPos);
            } else if(input.equals("d")) {
                player1.right();
                newDir = player1.getDir();
                playField.move(newDir, newxPos, newyPos);
            } else if(input.equals("x")) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("ERROR: Invalid input!");
            }

        } while(!input.equals("x"));
    }
}
