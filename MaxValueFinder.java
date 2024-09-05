import java.util.Random;

public class MaxValueFinder {

    // Method to find the maximum value in an array
    public static int findMax(int[] data) {
        int max = data[0]; // Assume first element is the maximum
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: Randomly generated array of 1,000 integers
        int[] data1 = new int[1000];
        Random random = new Random();
        for (int i = 0; i < data1.length; i++) {
            data1[i] = random.nextInt(10000); // Random number between 0 and 9999
        }
        int maxValue1 = findMax(data1);
        System.out.println("Test Case 1 - Maximum value in the random array: " + maxValue1);

        // Test Case 2: Array with all positive numbers
        int[] data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxValue2 = findMax(data2);
        System.out.println("Test Case 2 - Maximum value in the array: " + maxValue2);

        // Test Case 3: Array with negative and positive numbers
        int[] data3 = {-10, -5, 0, 5, 10};
        int maxValue3 = findMax(data3);
        System.out.println("Test Case 3 - Maximum value in the array: " + maxValue3);

        // Test Case 4: Array with all identical numbers
        int[] data4 = {5, 5, 5, 5, 5};
        int maxValue4 = findMax(data4);
        System.out.println("Test Case 4 - Maximum value in the array: " + maxValue4);

        // Test Case 5: Array with a single element
        int[] data5 = {42};
        int maxValue5 = findMax(data5);
        System.out.println("Test Case 5 - Maximum value in the array: " + maxValue5);
    }
}
