package com.file.util1;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        deleteFile("src/main/resources/File1.txt");
    }

    public static void deleteFile(String filename) {

        File f = new File(filename);
        if (f.delete()) {
            System.out.println("File deleted successfully: " + f.getName());
        } else {
            System.out.println("Failed deleting file: " + f.getName());
        }

    }

}
