# 📱 Calculator Application (with Exception Handling)

A simple Java-based calculator that performs basic arithmetic operations, generates Fibonacci sequences, and calculates the sum and average of an array. The application includes proper exception handling for robust user input and execution.

---

## 📁 Project Structure

### Files

- `UserInput.java`  
- `Calculator.java`  
- `Main.java`

---

## 🔹 UserInput.java

Handles all user input operations.

### Methods

- **`calcInput()`**  
  Prompts the user to enter two integers.  
  **Returns:** An `int[]` array containing the two values.

- **`fiboInput()`**  
  Requests the number of terms for the Fibonacci sequence.  
  **Returns:** An `int` indicating the number of terms.  
  Throws `IllegalArgumentException` if input is 0 or negative.

- **`arrInput(int size)`**  
  Prompts the user to enter elements for an array of a given size.  
  **Parameters:** `size` – the number of elements in the array.  
  **Returns:** An `int[]` array with user inputs.  
  Throws `NegativeArraySizeException` if size is negative.

---

## 🔹 Calculator.java

Performs the core mathematical operations.

### Methods

- **`addition()`**  
  Adds two user-provided numbers.  
  **Returns:** Sum (`int`).

- **`subtraction()`**  
  Subtracts the second number from the first.  
  **Returns:** Difference (`int`).

- **`multiplication()`**  
  Multiplies two integers.  
  **Returns:** Product (`int`).

- **`division()`**  
  Divides the first number by the second.  
  **Returns:** Quotient (`double`). Returns `0` if division by zero occurs.  
  Handles `ArithmeticException`.

- **`fibonacci()`**  
  Generates and prints a Fibonacci sequence using the number of terms from `UserInput`.  
  **Returns:** None.

- **`sumAverageArr(int size)`**  
  Accepts an array of integers and calculates the **sum** and **average**.  
  **Parameters:** `size` – the size of the array.  
  **Returns:** None.  
  Catches `NegativeArraySizeException`.

---

## 🔹 Main.java

Entry point of the application with a menu-driven interface.

### Method

- **`main(String[] args)`**  
  Displays options for the user to select an operation. Calls the appropriate method from `Calculator`.

---

## ✅ Available Operations

1. **Calculator**  
   - Addition  
   - Subtraction  
   - Multiplication  
   - Division  

2. **Fibonacci**  
   - Generate Fibonacci sequence.

3. **Array Operations**  
   - Calculate Sum and Average of an array.

4. **Exit**  
   - Terminate the application.

---

## ⚠️ Exception Handling

The application gracefully handles various runtime errors:

| Exception                  | Location                          | Description                                                                 |
|---------------------------|-----------------------------------|-----------------------------------------------------------------------------|
| `IllegalArgumentException`| `UserInput.fiboInput()`           | Thrown if the number of terms is ≤ 0.                                       |
| `NegativeArraySizeException` | `UserInput.arrInput()` & `Calculator.sumAverageArr()` | Thrown when a negative array size is entered.                            |
| `ArithmeticException`     | `Calculator.division()`           | Thrown on division by zero. Returns 0 and shows a warning.                 |
| `InputMismatchException`  | All input methods in `UserInput`  | Thrown on invalid input types (e.g., letters instead of numbers).          |
