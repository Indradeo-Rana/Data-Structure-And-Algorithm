package Arrays;

// Maximum  find the contiguous subarray

public class KadaneAlgo {

    static int subArray(int[] arr) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;
                // add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    static int maxSubArray(int[] arr) {
        int maxCount = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
            }
            maxCount = Math.max(maxCount, sum);
        }
        return maxCount;
    }
// Kadene's Algo is a dp technique in which we find max Sub array
    public static long maxSubarraySum(int[] arr) {
        int n = arr.length;
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) { // if sum > maxi: update maxi
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 7, -4, 3, 2, -10, 9, 1 };// { 4, -1, 2, -1 };
        // !st Approach

        // System.out.println(subArray(arr));

        // 2nd Approach

        // System.out.println(maxSubArray(arr));

        // 3rd Approach

        System.out.println(maxSubarraySum(arr));
    }
}
