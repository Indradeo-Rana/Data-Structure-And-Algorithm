package SlidingWindow;

public class MaxmSumTarget {
    static int SubArrSum(int[] arr, int k) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }
        maxSum = leftSum;
        int rIndex = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rIndex];
            rIndex = rIndex - 1;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,5,7,9,2,4,6,8 };
        int k = 4; // k means card or fixed size of array
        System.out
                .println("Maximum sum from subarray either from left side or right side will be " + SubArrSum(arr, k));
    }
}
