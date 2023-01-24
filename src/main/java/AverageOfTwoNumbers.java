
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here;
        // Prompt the user for two numbers
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        // Add the two inputted numbers and divide them by two to get the average
        double average = (1.0 * (firstNumber + secondNumber)) / 2;
        // Print the average to the console
        System.out.println("The average is " + average);
    }
}
