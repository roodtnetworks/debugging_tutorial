import java.util.Arrays;

public class ExceptionBreakpointDemo {
    public static void main(String[] args) {
        System.out.println("Starting program...");

        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing an invalid index: " + numbers[5]); // Causes ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        String text = null;
        printTextLength(text); // Causes NullPointerException

        System.out.println("Program finished.");
    }

    public static void printTextLength(String text) {
        System.out.println("Text length: " + text.length()); // Set an Exception Breakpoint here
    }
}
