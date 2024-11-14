package stringfile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class stringfile {

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Reverse and convert to string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        // Write the reversed string to a file
        String filePath = "output.txt"; // File to write to
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(reversedString);
            System.out.println("Reversed string has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
