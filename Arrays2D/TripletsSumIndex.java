package Arrays2D;

import java.util.ArrayList;
import java.util.List;

// Input: arr[] = [0, -1, 2, -3, 1]
// Output: [[0, 1, 4], [2, 3, 4]]
// Explanation: Triplets with sum 0 are:
// arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
// arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0

public class TripletsSumIndex {

    public List<List<Integer>> findTriplets(int arr[]) {
        List<List<Integer>> res = new ArrayList<>(); // Initialize the result list to store triplet indices
        int n = arr.length; // Get the length of the input array
        for (int i = 0; i < n - 2; i++) { // Iterate through the array, fixing the first element of the triplet
            for (int j = i + 1; j < n - 1; j++) { // Iterate through the array, fixing the second element of the triplet
                for (int k = j + 1; k < n; k++) { // Iterate through the array, fixing the third element of the triplet
                    if (arr[i] + arr[j] + arr[k] == 0) { // Check if the sum of the triplet is zero
                        List<Integer> temp = new ArrayList<>(); // Create a temporary list to store the indices of the triplet
                        temp.add(i); // Add the index of the first element
                        temp.add(j); // Add the index of the second element
                        temp.add(k); // Add the index of the third element
                        res.add(temp); // Add the triplet indices to the result list
                    }
                }
            }
        }
        return res; // Return the list of triplet indices
    }

    //   The main method to test the findTriplets method.
    public static void main(String[] args) {
        int[] intput = { 0, -1, 2, -3, 1 }; // Define the input array
        TripletsSumIndex obj = new TripletsSumIndex(); // Create an instance of the TripletsSumIndex class
        List<List<Integer>> res = obj.findTriplets(intput); // Call the findTriplets method and store the result
        System.out.println(res); // Print the result
    }
}