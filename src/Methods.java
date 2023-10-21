public class Methods {
    // 1. Create a method
    static void sayHi() {
        System.out.println("Hello User");
    }

    // 2. Create a method with parameters
    static void sayHiToUser(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old");
    }

    // 3. Create a method that returns a value
    static int add(int x, int y) {
        return x + y;
    }

    // Method overloading - same method name with different parameters
    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        // Call the method
        sayHi();

        // Call the method with parameters
        sayHiToUser("Mike", 30);

        // Call the method that returns a value and store in a variable
        String result = "2 + 2 = " + add(2, 2);
        System.out.println(result);

        // Call the method that overloads
        System.out.println("2 + 2 + 2 = " + add(2, 2, 2));
        System.out.println("2.5 + 2.5 = " + add(2.5, 2.5));
        System.out.println("2.5 + 2.5 + 2.5 = " + add(2.5, 2.5, 2.5));
    }

}
