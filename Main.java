//Name: Sahil Awatramani
//PRN: 23070126112
//Batch: B2
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scan = new Scanner(System.in);

        // Create instances of Input and Calculator classes
        Input in = new Input();
        Calculator calc = new Calculator();

        // Display the menu to the user
        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Square Root");
        System.out.println("6. Fibonacci Sequence");
        System.out.println("7. Mean of an Array");
        System.out.println("8. Mode of an Array");
        
        // Get user's choice
        int choice = scan.nextInt();

        // Execute the logic based on the user's choice
        switch (choice) {
            case 1: // Sum
                // Get two numbers and calculate their sum
                int[] sumNumbers = in.inputTwoNumbers();
                System.out.println("Sum: " + calc.calculateSum(sumNumbers));
                break;
            case 2: // Difference
                // Get two numbers and calculate their difference
                int[] diffNumbers = in.inputTwoNumbers();
                System.out.println("Difference: " + calc.calculateDifference(diffNumbers));
                break;
            case 3: // Product
                // Get two numbers and calculate their product
                int[] prodNumbers = in.inputTwoNumbers();
                System.out.println("Product: " + calc.calculateProduct(prodNumbers));
                break;
            case 4: // Quotient
                // Get two numbers and calculate their quotient
                int[] quotNumbers = in.inputTwoNumbers();
                System.out.println("Quotient: " + calc.calculateQuotient(quotNumbers));
                break;
            case 5: // Square Root
                // Get a single number and calculate its square root
                int sqrtNumber = in.inputSingleNumber();
                System.out.println("Square Root: " + calc.calculateSquareRoot(sqrtNumber));
                break;
            case 6: // Fibonacci Sequence
                // Get the number of terms and generate the Fibonacci sequence
                System.out.println("Enter the number of terms for the Fibonacci sequence:");
                int terms = scan.nextInt();
                calc.generateFibonacci(terms);
                break;
            case 7: // Mean
                // Get an array of numbers and calculate their mean
                int[] meanArray = in.inputArray();
                System.out.println("Mean: " + calc.calculateMean(meanArray));
                break;
            case 8: // Mode
                // Get an array of numbers and calculate their mode
                int[] modeArray = in.inputArray();
                System.out.println("Mode: " + calc.calculateMode(modeArray));
                break;
            default:
                // Handle invalid choices
                System.out.println("Invalid choice.");
                break;
        }
    }
}
