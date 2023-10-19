import java.lang.Math;

public class Maths {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("1 - 2 = " + subtract(1, 2));

        // Math methods
        // 1. max - returns the greater of two values
        System.out.println("max(1, 2) = " + Math.max(1, 2));

        // 2. min - returns the lesser of two values
        System.out.println("min(1, 2) = " + Math.min(1, 2));

        // 3. abs - returns the absolute value of a value
        System.out.println("abs(-1) = " + Math.abs(-1));

        // 4. pow - returns the value of the first argument raised to the power of the second argument
        System.out.println("pow(2, 3) = " + Math.pow(2, 3));

        // 5. sqrt - returns the square root of a value
        System.out.println("sqrt(4) = " + Math.sqrt(4));

        // 6. random - returns a random number between 0.0 and 1.0
        System.out.println("random() = " + Math.random());

        // 7. round - returns the closest long or int, as indicated by the method's return type, to the argument
        System.out.println("round(1.5) = " + Math.round(1.5));
    }
}