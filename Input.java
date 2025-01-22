import java.util.Scanner;

class Input {

    // Method to get two numbers from the user
    int[] inputTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter Second Number:");
        int secondNumber = scan.nextInt();
        return new int[]{firstNumber, secondNumber};
    }

    // Method to get a single number from the user
    int inputSingleNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        return scan.nextInt();
    }

    // Method to get an array of numbers from the user
    int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt(); // Get the size of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            // Read each element of the array
            array[i] = scan.nextInt();
        }
        return array;
    }
}
