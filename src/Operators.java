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

        int x = 5;
        int y = 3;
        System.out.println("x " + "+ y" + " = " + (x + y)); // Outputs 8
        System.out.println("x " + "- y" + " = " + (x - y)); // Outputs 2
        System.out.println("x " + "* y" + " = " + (x * y)); // Outputs 15
        System.out.println("x " + "/ y" + " = " + (x / y)); // Outputs 1
        System.out.println("x " + "% y" + " = " + (x % y)); // Outputs 2
        System.out.println("++x = " + ++x); // Outputs 6
        System.out.println("--x = " + --y); // Outputs 2
        System.out.println("================================================================");


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
        System.out.println("================================================================");


        // 3. Comparison Operators in Java
        // ==	Equal to	x == y
        // !=	Not equal	x != y
        // >	Greater than	x > y
        // <	Less than	x < y
        // >=	Greater than or equal to	x >= y
        // <=	Less than or equal to	x <= y
        int a = 5;
        int b = 3;
        System.out.println("a == b = " + (a == b)); // Outputs false
        System.out.println("a != b = " + (a != b)); // Outputs true
        System.out.println("a > b = " + (a > b)); // Outputs true
        System.out.println("a < b = " + (a < b)); // Outputs false
        System.out.println("a >= b = " + (a >= b)); // Outputs true
        System.out.println("a <= b = " + (a <= b)); // Outputs false
        System.out.println("================================================================");


        // 4. Logical Operators in Java
        // && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        // ||	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        // !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        // Example code
        int c = 5;
        int d = 3;
        System.out.println("c < 5 && d > 1 is " + (c < 5 && d > 1)); // Outputs true
        System.out.println("c < 5 || d > 1 is " + (c < 5 || d > 1)); // Outputs true
        System.out.println("!(c < 5 && d > 1) is " + !(c < 5 && d > 1)); // Outputs false
        System.out.println("================================================================");
    }
}
