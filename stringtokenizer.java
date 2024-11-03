import java.util.StringTokenizer;
import java.util.Scanner;

public class IntegerTokenizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;

        System.out.println("Integers:");
        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum of integers: " + sum);
    }
}
