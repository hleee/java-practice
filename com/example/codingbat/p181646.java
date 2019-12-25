package com.example.codingbat;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling.
Return true if we are in trouble.
 */

public class p181646 {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else return !aSmile && !bSmile;
    }

    public static void main(String[] args) {
        p181646 mt = new p181646();
        boolean result = mt.monkeyTrouble(true, false);
        System.out.println(result);
    }
}
