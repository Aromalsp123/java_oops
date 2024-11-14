
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite{
    public static void main (String[] args){
        String file ="input.txt";
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(file))){
            writer.write("Hello, World!");
            writer.newLine(); // Add a new line
            writer.write("This is a sample text written to the file.");
            writer.newLine();
            writer.write("Goodbye!");
            System.out.println("Data has been written to " + file);
        } catch (IOException e) {
            // Handle any IO exceptions
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    

        }
    }
