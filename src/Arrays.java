public class Arrays {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = new int[5];
        // int[] numbers = {10, 20};
        numbers[0] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        String[] cars = {"Camaro", "Corvette", "Tesla"};
        System.out.println("The value of cars[0] is: " + cars[0]);

        // Change the value of an element
        cars[0] = "Mustang";
        System.out.println("The new value of cars[0] is: " + cars[0]);

        // Get length of array
        System.out.println("The length of the cars array is: " + cars.length);
        System.out.println("===========================================");

        // Loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println("The value of cars[" + i + "] is: " + cars[i]);
        }
        System.out.println("===========================================");

        // Loop through an array with foreach
        for (String car : cars) {
            System.out.println("The value of car with foreach is: " + car);
        }

        // Multidimensional arrays
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("The value of data[0][2] is: " + data[0][2]);
        System.out.println();

        // Loop through multidimensional array
        for (int i = 0; i < data.length; i++) {
            System.out.println("The value of data[" + i + "] is: " + data[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("The value of data[" + i + "][" + j + "] is: " + data[i][j]);
            }
        }
    }
}
