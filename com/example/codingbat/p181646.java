package com.example.codingbat;

public class p181646 {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else return !aSmile && !bSmile;
    }

    public static void main(String[] args) {
        p181646 mt = new p181646();
        mt.monkeyTrouble(true, false);
    }
}
