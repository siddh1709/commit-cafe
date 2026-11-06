
public class CommitCafe {

    private static String barista = "Alex"; // STUDENT_TODO_1A: Change name
    private static String nickname = "The Coffee Master"; // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        cups++; // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        System.out.println(barista + " is brewing " + drink + "!");
        System.out.println("Enjoy your " + drink + "!"); // STUDENT_TODO_2B: Add a second brew-related improvement
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
