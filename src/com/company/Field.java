package com.company;

public class Field {

    //Initialisation of the field of play
    private String[][] field = {{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
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
}
