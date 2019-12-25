package com.example.io;

import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {
        String inputFileName = "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\input.txt";
        String outputFileName = "C:\\Users\\hlee\\Documents\\GitHub\\java-practice\\com\\example\\io\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line = reader.readLine();
            int lineNumber = 1;
            while (line != null) {
                String inputLine = String.format("Name on Line #%d: %s\n", lineNumber, line);
                System.out.print(inputLine);
                writer.write(inputLine);

                line = reader.readLine();
                lineNumber++;
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
