package com.company;

public class Player {

    private String dir = ">";

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

    //Getter for the player's direction
    public String getDir() {
        return dir;
    }
}
