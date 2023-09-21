package com.FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String filename = "manish.txt";

        // Create a file
        createFile(filename);

        // Write data to the file
        String data = "Hello, World!";
        writeFile(filename, data);

        // Read data from the file
        String readData = readFile(filename);
        System.out.println("Data read from the file: " + readData);

        // Delete the file
        deleteFile(filename);
    }

    // Create a file
    public static void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + filename);
            } else {
                System.out.println("File already exists: " + filename);
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    // Write data to a file
    public static void writeFile(String filename, String data) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(data);
            writer.close();
            System.out.println("This is Manish");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Read data from a file
    public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filename);
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
        return content.toString();
    }

    // Delete a file
    public static void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted: " + filename);
        } else {
            System.err.println("Failed to delete file: " + filename);
        }
    }
}

