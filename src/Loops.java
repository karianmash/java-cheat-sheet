public class Loops {
    public static void main(String[] args) {
        // 1. While loop
        int i = 0;
        while (i < 5) {
            System.out.println("Current value of i: " + i);
            i++;
        }
        System.out.println("======================================");

        // 2. Do-while loop
        int j = 0;
        do {
            System.out.println("Current value of j: " + j);
            j++;
        } while (j < 5);
        System.out.println("======================================");

        // 3. For loop
        for (int k = 0; k < 5; k++) {
            System.out.println("Current value of k: " + k);
        }
        System.out.println("======================================");

        // 4. For-each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println("This is a " + car);
        }
    }
}
