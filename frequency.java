import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use the correct scanner name
        System.out.println("Enter a word:");
        String word = sc.nextLine(); // Use 'sc' instead of 'scanner'
        System.out.println("Enter search element:");
        String element = sc.nextLine(); // Use 'sc' instead of 'scanner'
        
        char n = element.charAt(0); // Get the first character of the element
        char[] chars = word.toCharArray(); // Correctly declare the char array
        int count = 0; // Initialize count
        int len = chars.length; // Get the length of the character array
        
        // Loop through the characters in the word
        for (int i = 0; i < len; i++) {
            if (n == chars[i]) { // Compare with the correct array
                count++; // Increment count if there is a match
            }
        }
        
        // Print the result
        System.out.println(n + " repeats " + count + " times");
        
        // Close the scanner
        sc.close();
    }
}
