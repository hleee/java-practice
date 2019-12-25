package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\input.txt"));
            String line = reader.readLine();
            int lineNumber = 1;
            while (line != null) {
                System.out.println("Name on Line #" + lineNumber + ": " + line);
                line = reader.readLine();
                lineNumber++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
