public class DataType {

    public static void main(String[] args) {
        // A primitive data type specifies the size and type of variable values, and it has no additional methods.

        // 1. Integer - (4 bytes) Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int a = 10;
        System.out.println("This is an integer: " + a);

        // 2. Float - (4 bytes) Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float b = 10.5f;
        System.out.println("This is a float: " + b);

        // 3. Double - (8 bytes) Stores fractional numbers. Sufficient for storing 15 decimal digits
        double c = 10.5;
        System.out.println("This is a double: " + c);

        // 4. Boolean - (1 bit) Stores true or false values
        boolean d = true;
        System.out.println("This is a boolean: " + d);

        // 5. Character - (2 bytes) Stores a single character/letter or ASCII values
        char e = 'H';
        System.out.println("This is a character: " + e);

        // 6. Byte - (1 byte) Stores whole numbers from -128 to 127
        byte f = 100;
        System.out.println("This is a byte: " + f);

        // 7. Short - (2 bytes) Stores whole numbers from -32,768 to 32,767
        short g = 5000;
        System.out.println("This is a short: " + g);

        // 8. Long - (8 bytes) Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long h = 15000000000L;
        System.out.println("This is a long: " + h);

        // Non-primitive data types are called reference types because they refer to objects.

        // String
        String s = "Hello World";
        System.out.println("This is a string: " + f);


        // Declare multiple variables
        int x = 10, y = 20, z = 30;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // NB:
        // A primitive type has always a value, while non-primitive types can be null.
        // A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
    }

}
