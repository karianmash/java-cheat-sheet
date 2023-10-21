public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        int result = factorialTailRecursive(number, 1); // Initialize accumulator to 1
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // NB: This is a bad example of recursion, as it is not tail-recursive.
    // A tail-recursive function is one where the recursive call is the last thing that happens in the function.
    // This means that the stack will grow with each recursive call, and will eventually overflow.
    // A tail-recursive version of this function would be: return factorial(n, 1);

    public static int factorialTailRecursive(int n, int accumulator) {
        if (n == 0) {
            return accumulator; // Return the accumulated result when the base case is reached
        } else {
            // The recursive call is the last operation, and it updates the accumulator
            return factorialTailRecursive(n - 1, n * accumulator);
        }
    }

}
