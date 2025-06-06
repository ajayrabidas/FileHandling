package com.file.util1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        readFileContent("src/main/resources/File1.txt");
    }

    public static void readFileContent(String filename) {

        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred while reading file");
            throw new RuntimeException(e);
        }
    }


}
