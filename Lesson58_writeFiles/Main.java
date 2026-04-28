package Lesson58_writeFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for smaller or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "/Users/carsonnghiem/Desktop/Learning Java/BroCode/LearningJava/src/Lesson58_writeFiles/test.txt";
//        String textContent = "I like pizza!\nIt's really good!\nBuy me pizza!";
        String textContent = """ 
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE!
                """; // Multi-line String

        // Filepath can be determined by directing towards the specific location that file is or will be in (Different for different Operating Systems)
        try(FileWriter writer = new FileWriter(filePath)) { // It's more organized to represent the filepath through a variable instead of pasting directly into argument
            writer.write(textContent); // Similar to reasoning above ^
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e) { // This is a more specific exception catch, giving a more detailed exception reason
            System.out.println("Could not locate file location");
        }
        catch(IOException e) { // Acts as the safety net for writing to files (Similar to catching Exception)
            System.out.println("Could not write file");
        }
    }
}
