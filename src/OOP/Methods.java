package OOP;

public class Methods {
    public static void main(String[] args) {
        // Call method
        sayHello();
        sayHelloTo("John");
        System.out.println("Square of 5 is " + square(5));
    }

    // Method without parameter
    static void sayHello() {
        System.out.println("Hello");
    }

    // Method with parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // Method with return value
    static int square(int x) {
        return x * x;
    }
}
