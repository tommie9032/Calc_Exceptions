import java.util.Arrays;

// A utility class that provides various mathematical and statistical operations
class Calculator {

    // Calculates the sum of the first two elements in the array
    int calculateSum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Calculates the difference between the first two elements in the array
    int calculateDifference(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Calculates the product of the first two elements in the array
    int calculateProduct(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Calculates the quotient of the first two elements in the array
    double calculateQuotient(int[] numbers) {
        if (numbers[1] == 0) {
            // Prevent division by zero
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numbers[0] / numbers[1];
    }

    // Calculates the square root of the given number
    double calculateSquareRoot(int number) {
        if (number < 0) {
            // Square root of a negative number is not defined in real numbers
            throw new ArithmeticException("Cannot compute square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    // Generates and prints a Fibonacci sequence of the given number of terms
    void generateFibonacci(int terms) {
        if (terms <= 0) {
            // Number of terms must be positive
            throw new IllegalArgumentException("Number of terms must be positive.");
        }

        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " "); // Print the current term
            int next = a + b;          // Calculate next term
            a = b;                     // Shift values
            b = next;
        }
        System.out.println(); // Print newline at the end
    }

    // Calculates and returns the mean (average) of elements in the array
    double calculateMean(int[] array) {
        if (array.length == 0) {
            // Mean of an empty array is undefined
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    // Calculates and returns the mode (most frequent element) of the array
    int calculateMode(int[] array) {
        if (array.length == 0) {
            // Mode of an empty array is undefined
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        Arrays.sort(array); // Sort the array to simplify frequency counting

        int mode = array[0];
        int currentCount = 1, maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++; // Increase count if same as previous
            } else {
                currentCount = 1; // Reset count
            }

            // Update mode if current count is the highest seen so far
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = array[i];
            }
        }

        return mode;
    }
}
