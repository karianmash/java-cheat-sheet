public class Conditionals {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // 1. If statement
        if (x < y) {
            System.out.println("x is less than y");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }

        // 2. Ternary operator
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // 3. Switch statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // break is optional
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // break is optional
            case 4:
                System.out.println("Thursday");
                break; // break is optional
            case 5:
                System.out.println("Friday");
                break; // break is optional
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break; // break is optional
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
