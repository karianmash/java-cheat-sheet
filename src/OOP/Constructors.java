package OOP;

public class Constructors {
    public static void main(String[] args) {
        // Create object
        Person person1 = new Person("John", 20, 'M', "Jakarta");
        Person person2 = new Person("Jane", 18, 'F', "Bandung");

        // Call method
        person1.sayHello();
        person2.sayHello();
    }
}
