package com.company;

public class Player {

    private String dir = ">";
    private int xPos = 1;
    private int yPos = 1;

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
}
