package com.example.codingbat;
/* Problem
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

public class p182873 {
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        p182873 p1 = new p182873();
        p1.makes10(1, 2);
    }
}

/* Solution
public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || a+b == 10);
}
*/
