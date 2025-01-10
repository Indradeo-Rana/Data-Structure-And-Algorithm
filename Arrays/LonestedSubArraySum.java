package Arrays;

public class LonestedSubArraySum {

    // Approach 1: Generate all posiible subarray with O(n^3)

    // static void subArray(int[] arr, int target){
    // int len=0;
    // for(int i =0;i<arr.length;i++){
    // for(int j=0;j<arr.length;j++){
    // int sum=0;
    // for(int k=i;k<j;k++){
    // sum +=arr[k];
    // if(sum == target){
    // len= Math.max(len, j-i+1);
    // }
    // }
    // }
    // }
    // System.out.println(len);
    // }

    // Approach 2 :  Generate all posiible subarray with O(n^2)

    // static void subArray1(int[] b, int target) {
    //     int len = 0;
    //     int sum = 0;
    //     for (int i = 0; i < b.length; i++) {
    //         for (int j = i; j < b.length; j++) {
    //             sum += b[j];
    //             if (sum == target)
    //                 len = Math.max(len, j - i + 1);
    //         }
    //     }
    //     System.out.println(len);
    // }

    // 3rd approach using 2 pointer
    static void subArray(int[] a, int k) {
        int n = a.length; // size of the array.
        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n)
                sum += a[right];
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int target = 10;
        subArray(arr, target);
        // subArray1(arr, target);
    }
}
