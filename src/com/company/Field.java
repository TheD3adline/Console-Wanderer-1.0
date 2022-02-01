package com.company;

public class Field {

    //Initialisation of the field of play
    private String dir = ">";
    private int posX = 1;
    private int posY = 1;
    private String[][] field = {{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                {"#", ">", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                                {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};

    //Console print command for field of play
    public void printField(){
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    //Executes directional commands
    public void setDir(String dir) {
        this.dir = dir;
        field[posY][posX] = this.dir;
    }

    //Executes movement commands with collision check
    public void move() {
        if((dir.equals(">")) && (field[posY][posX + 1].equals(" "))) {
            field[posY][posX] = " ";
            posX++;
            field[posY][posX] = dir;
            System.out.println("You move forward...");
            System.out.println();
        } else if((dir.equals("<")) && (field[posY][posX - 1].equals(" "))) {
            field[posY][posX] = " ";
            posX--;
            field[posY][posX] = dir;
            System.out.println("You move forward...");
            System.out.println();
        } else if((dir.equals("v")) && (field[posY + 1][posX].equals(" "))) {
            field[posY][posX] = " ";
            posY++;
            field[posY][posX] = dir;
            System.out.println("You move forward...");
            System.out.println();
        } else if((dir.equals("^")) && (field[posY - 1][posX].equals(" "))) {
            field[posY][posX] = " ";
            posY--;
            field[posY][posX] = dir;
            System.out.println("You move forward...");
            System.out.println();
        } else {
            System.out.println("There is something blocking your path...");
            System.out.println();
        }
    }
}
