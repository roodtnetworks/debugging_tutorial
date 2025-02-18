import java.util.Arrays;

public class DebuggingChallenge {
    public static void main(String[] args) {
        System.out.println("Starting program...");

        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum); // Expected: 38

        double average = calculateAverage(numbers);
        System.out.println("Average value: " + average); // Expected: 3.8

        System.out.println("Program finished.");
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) { // Subtle bug: should be i < numbers.length
            sum += numbers[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers) {
        return calculateSum(numbers) / numbers.length; // Bug: Integer division leads to incorrect average
    }
}
