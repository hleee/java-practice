package com.example.codingbat;

public class p181646 {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        p181646 mt = new p181646();
        mt.monkeyTrouble(true, false);
    }


}
