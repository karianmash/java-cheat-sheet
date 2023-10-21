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

    // NB: Static method can only access static variables and belongs to the class
    // Public method can access both static and non-static variables and belongs to the object
}
