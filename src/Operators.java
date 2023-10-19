public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators in Java
        // +	Addition	Adds together two values	x + y
        // -	Subtraction	Subtracts one value from another	x - y
        // *	Multiplication	Multiplies two values	x * y
        // /	Division	Divides one value by another	x / y
        // %	Modulus	Returns the division remainder	x % y
        // ++	Increment	Increases the value of a variable by 1	++x
        // --	Decrement	Decreases the value of a variable by 1	--x

        // Example code
        int x = 5;
        int y = 3;
        System.out.println("x " + "+ y" + " = " + (x + y)); // Outputs 8
        System.out.println("x " + "- y" + " = " + (x - y)); // Outputs 2
        System.out.println("x " + "* y" + " = " + (x * y)); // Outputs 15
        System.out.println("x " + "/ y" + " = " + (x / y)); // Outputs 1
        System.out.println("x " + "% y" + " = " + (x % y)); // Outputs 2
        System.out.println("++x = " + ++x); // Outputs 6
        System.out.println("--x = " + --y); // Outputs 2

        // 2. Assignment Operators in Java
        // =	    n = 5	    n = 5
        // +=	    n += 3	    n = n + 3
        // -=	    n -= 3	    n = n - 3
        // *=	    n *= 3	    n = n * 3
        // /=	    n /= 3	    n = n / 3
        // %=	    n %= 3	    n = n % 3
        // &=	    n &= 3	    n = n & 3
        // |=	    n |= 3	    n = n | 3
        // ^=	    n ^= 3	    n = n ^ 3
        // >>=	    n >>= 3	    n = n >> 3
        // <<=	    n <<= 3	    n = n << 3
        int n = 5;
        System.out.println("n = " + n); // Outputs 5

        n += 3;
        System.out.println("n = " + n); // Outputs 8

        n -= 3;
        System.out.println("n = " + n); // Outputs 5

        n *= 3;
        System.out.println("n = " + n); // Outputs 15

        n /= 3;
        System.out.println("n = " + n); // Outputs 5

        n %= 3;
        System.out.println("n = " + n); // Outputs 2

        n &= 3;
        System.out.println("n = " + n); // Outputs 2

        n |= 3;
        System.out.println("n = " + n); // Outputs 3

        n ^= 3;
        System.out.println("n = " + n); // Outputs 0

        n >>= 3;
        System.out.println("n = " + n); // Outputs 0

        n <<= 3;
        System.out.println("n = " + n); // Outputs 0
    }
}
