package com.file.util1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        createAndWriteToFile("src/main/resources/File1.txt");
    }

    public static void createAndWriteToFile(String filename) {
        try {

            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is written by FileWriter");
            writer.close();

            System.out.println("Written to file and closed successfully");
        } catch (IOException e) {
            System.out.println("An error has occurred while writing");
            throw new RuntimeException(e);
        }

    }


}
