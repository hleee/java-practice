package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\input.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();
            int lineNumber = 1;
            while (line != null) {
                String inputLine = String.format("Name on Line #%d: %s", lineNumber, line);
                System.out.println(inputLine);
                line = reader.readLine();
                lineNumber++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
