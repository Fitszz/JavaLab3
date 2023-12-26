import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Division that may cause ArithmeticException
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);

            // Input that may cause NumberFormatException
            System.out.print("Enter a number as a string: ");
            String userInput = scanner.next();

            int parsedNumber = parseStringToNumber(userInput);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } finally {
            // This block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed. Closing resources...");
            scanner.close();
        }

        System.out.println("End of program.");
    }

    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }

    private static int parseStringToNumber(String input) {
        return Integer.parseInt(input);
    }
}
