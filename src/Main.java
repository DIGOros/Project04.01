public class Main {
    public static void main(String[] args) {

        String test = "banana";
        int n = 5;

        // While loop with decrement
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("It works, I suppose...");

        // Do-while loop with increment
        int i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i <= 5);
        System.out.println("\nIt also works...");

        // For loop with increment
        for (int j = 1; j <= 9; j++) {
            System.out.print(j);
        }
        System.out.println("\nSeems to be working too");

        // For loop with decrement
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
        }
        System.out.println("\nOk");

        // Iterate through characters in the string
        System.out.println("\nCharacters in the string:");
        for (int l = 0; l < test.length(); l++) {
            System.out.println(test.charAt(l));
        }
        System.out.println("Oh cool, next one");

        // Nested loops: outer loop prints weeks, inner loop prints days
        int weeks = 3;
        int days = 7;
        for (int week = 1; week <= weeks; ++week) {
            System.out.println("Week: " + week);
            for (int day = 1; day <= days; ++day) {
                System.out.println("  Day: " + day);
            }
        }
        System.out.println("Yep! That is all for here...");
    }
}
