package file;

import java.io.*;
import java.nio.file.*;

public class FileSystem {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\DELL\\Documents\\input.txt";
        String outputFile = "C:\\Users\\DELL\\Documents\\output.txt";

        try {

            String content = readFile(inputFile);


            int wordCount = countWords(content);
            int lineCount = countLines(content);


            writeFile(outputFile, wordCount, lineCount);

            System.out.println("File processing completed successfully!");

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file " + inputFile + " was not found.");
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }


    public static String readFile(String fileName) throws IOException {

        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File " + fileName + " does not exist.");
        }


        return new String(Files.readAllBytes(path));
    }


    public static int countWords(String content) {

        String[] words = content.split("\\s+");
        return words.length;
    }


    public static int countLines(String content) {

        String[] lines = content.split("\n");
        return lines.length;
    }


    public static void writeFile(String fileName, int wordCount, int lineCount) throws IOException {
        String output = "Word Count: " + wordCount + "\nLine Count: " + lineCount;


        Path outputPath = Paths.get(fileName);
        Files.write(outputPath, output.getBytes());
    }
}
