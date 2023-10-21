package OOP;

public class Attributes {
    int x = 5;
    final int y = 10; // Final variables cannot be changed

    public static void main(String[] args) {
        // Create an object of class Attributes (This will call the constructor)
        Attributes myObj = new Attributes();

        // Print the value of x
        System.out.println("The value of x is: " + myObj.x);

        // Change the value of x
        myObj.x = 40;
        System.out.println("The new value of x is: " + myObj.x);

        // Create another object of class Attributes
        Attributes myObj2 = new Attributes();
    }
}
