// Name: Sahil Awatramani
// PRN: 23070126112
// Batch: B2

import java.util.InputMismatchException;
import java.util.Scanner;

// Main class to run the calculator program
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner object for user input
        Input in = new Input();                 // Custom Input class instance
        Calculator calc = new Calculator();     // Calculator class instance

        try {
            // Display menu options
            System.out.println("Choose an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Quotient");
            System.out.println("5. Square Root");
            System.out.println("6. Fibonacci Sequence");
            System.out.println("7. Mean of an Array");
            System.out.println("8. Mode of an Array");

            int choice = scan.nextInt();  // Read user’s choice

            // Perform operation based on the user’s choice
            switch (choice) {
                case 1:
                    // Sum of two numbers
                    int[] sumNumbers = in.inputTwoNumbers();
                    System.out.println("Sum: " + calc.calculateSum(sumNumbers));
                    break;
                case 2:
                    // Difference of two numbers
                    int[] diffNumbers = in.inputTwoNumbers();
                    System.out.println("Difference: " + calc.calculateDifference(diffNumbers));
                    break;
                case 3:
                    // Product of two numbers
                    int[] prodNumbers = in.inputTwoNumbers();
                    System.out.println("Product: " + calc.calculateProduct(prodNumbers));
                    break;
                case 4:
                    // Quotient of two numbers
                    int[] quotNumbers = in.inputTwoNumbers();
                    System.out.println("Quotient: " + calc.calculateQuotient(quotNumbers));
                    break;
                case 5:
                    // Square root of a number
                    int sqrtNumber = in.inputSingleNumber();
                    System.out.println("Square Root: " + calc.calculateSquareRoot(sqrtNumber));
                    break;
                case 6:
                    // Generate Fibonacci sequence
                    System.out.println("Enter the number of terms for the Fibonacci sequence:");
                    int terms = scan.nextInt();
                    calc.generateFibonacci(terms);
                    break;
                case 7:
                    // Calculate mean of an array
                    int[] meanArray = in.inputArray();
                    System.out.println("Mean: " + calc.calculateMean(meanArray));
                    break;
                case 8:
                    // Calculate mode of an array
                    int[] modeArray = in.inputArray();
                    System.out.println("Mode: " + calc.calculateMode(modeArray));
                    break;
                default:
                    // If input doesn't match any case
                    System.out.println("Invalid choice.");
                    break;
            }

        // Handle various types of input and logic errors
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter only numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner resource
            scan.close();
        }
    }
}
