public class Strings {
    // Strings are immutable
    // Strings are used for storing text.
    public static void main(String[] args) {
        String name = "John";
        String surname = "Doe";

        // 1. String concatenation
        // String fullName = name + " " + surname;
        String fullName = name.concat(" ").concat(surname);
        System.out.println("The full name is: " + fullName); // "John Doe

        // 2. String length
        System.out.println("The length of the string is: " + fullName.length()); // 8

        // 3. Convert to uppercase and lowercase
        System.out.println("Convert to uppercase: " + fullName.toUpperCase()); // JOHN DOE
        System.out.println("Convert to lowercase: " + fullName.toLowerCase()); // john doe

        // 4. Check if string contains a sequence of characters
        System.out.println("Get index of a specific character: " + fullName.indexOf("Doe")); // 5
        System.out.println("This fails because it's case sensitive: " + fullName.indexOf("doe")); // -1

        // 5. Check the character at a specific index
        System.out.println("Get character at a specific index: " + fullName.charAt(0)); // J

        // 6. Check if string starts or ends with a specific sequence of characters
        System.out.println(fullName.startsWith("John")); // true

        // 7. Check if string is empty
        System.out.println(fullName.isEmpty()); // false

        // 8. Replace a character or a sequence of characters
        System.out.println(fullName.replace("John", "Jane")); // Jane Doe

        // 9. Split a string into an array of strings
        String[] split = fullName.split(" ");

        // 10. Get a substring
        System.out.println(fullName.substring(0, 4)); // John

        // 11. Remove whitespace
        System.out.println(fullName.trim()); // John Doe

        // 12. Convert to string
        System.out.println(String.valueOf(123)); // 123

        // 13. Compare strings
        System.out.println("John".equals("John")); // true

        // 14. Compare strings (case insensitive)
        System.out.println("John".equalsIgnoreCase("john")); // true
    }
}
