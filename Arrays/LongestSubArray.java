package Arrays;

// import java.util.HashMap;
// import java.util.Map;

//  Longest Subarray with given Sum K(Positives)
public class LongestSubArray {
    public static void main(String[] args) {
        // int[] a ={ 2, 3, 5, 1, 9 };
        int[] a= {10,5,2,7,9,1};
        int t = 15;

        // approach1 -> Generate all subArray
        // int sum=0;
        // int len = 0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i; j < a.length; j++) {
        //         sum = 0;
        //         for (int k = i; k <= j; k++) {
        //             sum += a[k];
        //         }
        //         if (sum == t) {
                    
        //             len = Math.max(len, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println(len);

        //2nd Approach
        // int len=0;
        // for(int i =0;i<a.length;i++){
        //     int sum =0;
        //     for(int j=i;j<a.length;j++){
        //         sum +=a[j];
        //         if(sum == t)
        //         len = Math.max(len,j -i+1);
        //     }
        // }
        // System.out.println(len);

        // 3rd Approach using Map
        // Map<Long, Integer> preSumMap = new HashMap<>();
        // long sum = 0;
        // int maxLen = 0;
        // for (int i = 0; i < a.length; i++) {
        //     //calculate the prefix sum till index i:
        //     sum += a[i];

        //     // if the sum = k, update the maxLen:
        //     if (sum == t) {
        //         maxLen = Math.max(maxLen, i + 1);
        //     }

        //     // calculate the sum of remaining part i.e. x-k:
        //     long rem = sum - t;

        //     //Calculate the length and update maxLen:
        //     if (preSumMap.containsKey(rem)) {
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }

        //     //Finally, update the map checking the conditions:
        //     if (!preSumMap.containsKey(sum)) {
        //         preSumMap.put(sum, i);
        //     }
        // }
        // System.out.println(maxLen);

        // using 2 pointer approach
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > t) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == t) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }
        System.out.println(maxLen);
    }
}
