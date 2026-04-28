package Lesson59_readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "/Users/carsonnghiem/Desktop/Learning Java/BroCode/LearningJava/src/Lesson59_readFiles/test.txt";

//        FileReader fileReader = new FileReader(filePath); // This is what actually reads the files
//        BufferedReader reader = new BufferedReader(fileReader); // Acts as middle-man between the program and the file system; helps read more efficiently

        try(FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }

}
