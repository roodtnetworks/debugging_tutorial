public class DebuggingBasics {
    public static void main(String[] args) {
        System.out.println("Starting program...");
        
        int num1 = 10;
        int num2 = 5;
        
        int result = addNumbers(num1, num2);
        System.out.println("Sum: " + result);

        String message = greetUser("Alice");
        System.out.println(message);

        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);
        
        System.out.println("Program finished.");
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b; // Set a breakpoint here
        return sum;
    }

    public static String greetUser(String name) {
        return "Hello, " + name + "!"; // Step into this method
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1); // Step into recursion
    }
}
