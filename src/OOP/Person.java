package OOP;

class Person {
    public String name;
    public int age;
    final private char gender;
    protected String address;

    // Constructor
    Person(String name, int age, char gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Greetings
    void sayHello() {
        System.out.println("Hello " + name);
    }

    // Get name
    String getName() {
        return name;
    }

    // Get age
    int getAge() {
        return age;
    }

}
