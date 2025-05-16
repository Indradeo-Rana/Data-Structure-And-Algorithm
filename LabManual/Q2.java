import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for the size of the array
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();
        Random random = new Random();
        // Generate an array of random numbers
        int[] array = generateRandomArray(n, 1, 100, random);
        System.out.println("Generated Array: " + Arrays.toString(array));
        long startTime = System.nanoTime(); // Record start time
        mergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime(); // Record end time
        long duration = endTime - startTime;
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Time taken for Merge Sort: " + duration + " nanoseconds");
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Merge Sort Time Complexity: O(n log n)
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Recursively sort the two halves
            mergeSort(array, left, mid);

            mergeSort(array, mid + 1, right);
            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);
        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        // Copy remaining elements if any
        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    private static int[] generateRandomArray(int size, int min, int max, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

}
