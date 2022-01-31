package com.company;

public class Player {

    private String dir = ">";
    private int xPos = 1;
    private int yPos = 1;

    //Player forward command
    public void fwd(){
        if(dir.equals(">")) {
            xPos++;
        } else if(dir.equals("<")) {
            xPos--;
        } else if(dir.equals("v")) {
            yPos++;
        } else if(dir.equals("^")) {
            yPos--;
        }
    }

    //Player directional controls
    public void left() {
        if(dir.equals(">")) {
            dir = "^";
        } else if(dir.equals("^")) {
            dir = "<";
        } else if(dir.equals("<")) {
            dir = "v";
        } else if(dir.equals("v")) {
            dir = ">";
        }
    }

    public void right() {
        if(dir.equals(">")) {
            dir = "v";
        } else if(dir.equals("v")) {
            dir = "<";
        } else if(dir.equals("<")) {
            dir = "^";
        } else if(dir.equals("^")) {
            dir = ">";
        }
    }

    //Getters for the player's direction and position in the field
    public String getDir() {
        return dir;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
