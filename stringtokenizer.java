package stringtokenizer;

import java.util.*;

public class StringTokenizerExample {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with integers separated by spaces:");

        // Read the entire line of input
        String input = sc.nextLine();
        
        // Create a StringTokenizer to split the input string by spaces
        StringTokenizer st = new StringTokenizer(input, " ");
        
        // Process each token
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            try {
                // Parse the token to an integer
                int number = Integer.parseInt(token);
                System.out.println("Parsed integer: " + number);
                sum += number; // Add to sum
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + token + "' is not an integer.");
            }
        }
        
        // Print the sum of the integers
        System.out.println("Sum of the integers is: " + sum);
        sc.close();
    }
}
