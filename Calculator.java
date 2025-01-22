import java.util.Arrays;

class Calculator {

    // Method to calculate the sum of two numbers
    int calculateSum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Method to calculate the difference of two numbers
    int calculateDifference(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Method to calculate the product of two numbers
    int calculateProduct(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Method to calculate the quotient of two numbers
    double calculateQuotient(int[] numbers) {
        if (numbers[1] == 0) {
            // Check for division by zero
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) numbers[0] / numbers[1];
    }

    // Method to calculate the square root of a number
    double calculateSquareRoot(int number) {
        if (number < 0) {
            // Check for negative input
            System.out.println("Square root of a negative number is not allowed.");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    // Method to generate the Fibonacci sequence for the given number of terms
    void generateFibonacci(int terms) {
        if (terms <= 0) {
            // Check for invalid input
            System.out.println("Number of terms must be positive.");
            return;
        }
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            // Print the current term and calculate the next term
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Method to calculate the mean of an array
    double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            // Sum all elements in the array
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Method to calculate the mode of an array using sorting
    int calculateMode(int[] array) {
        Arrays.sort(array); // Sort the array
        int mode = array[0];
        int currentCount = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                // Increment the count for the current number
                currentCount++;
            } else {
                // Reset the count for a new number
                currentCount = 1;
            }

            // Update the mode if a higher count is found
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = array[i];
            }
        }

        return mode;
    }
}
