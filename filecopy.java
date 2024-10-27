package com.studyopedia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Specify the source and destination files
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Initialize FileInputStream and FileOutputStream
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            // Buffer to hold data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source file and write to destination file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
