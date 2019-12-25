package com.example.io;

import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\input.txt";
        String outputFileName = "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line = reader.readLine();
            int lineNumber = 1;
            while (line != null) {
                String inputLine = String.format("Name on Line #%d: %s", lineNumber, line + "\n");
                System.out.print(inputLine);
                line = reader.readLine();
                lineNumber++;

                writer.write(inputLine);
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
