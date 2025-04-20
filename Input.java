import java.util.InputMismatchException;
import java.util.Scanner;

// A helper class to handle different types of numeric user inputs
class Input {

    // Method to input two integers from the user
    int[] inputTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        int firstNumber, secondNumber;

        try {
            System.out.println("Enter First Number:");
            firstNumber = scan.nextInt(); // Read first number

            System.out.println("Enter Second Number:");
            secondNumber = scan.nextInt(); // Read second number
        } catch (InputMismatchException e) {
            // Handle non-integer input
            throw new InputMismatchException("Invalid input! Only numbers are allowed.");
        }

        // Return both numbers as an array
        return new int[]{firstNumber, secondNumber};
    }

    // Method to input a single integer from the user
    int inputSingleNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        try {
            return scan.nextInt(); // Return the entered integer
        } catch (InputMismatchException e) {
            // Handle invalid input
            throw new InputMismatchException("Invalid input! Only numbers are allowed.");
        }
    }

    // Method to input an array of integers from the user
    int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt(); // Read array size

        if (size < 0) {
            // Disallow negative array sizes
            throw new NegativeArraySizeException("Array size cannot be negative.");
        }

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        // Read individual elements into the array
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scan.nextInt(); // Store element at index i
            } catch (InputMismatchException e) {
                // Handle invalid input during array entry
                throw new InputMismatchException("Invalid input! Only numbers are allowed.");
            }
        }

        return array; // Return the populated array
    }
}
