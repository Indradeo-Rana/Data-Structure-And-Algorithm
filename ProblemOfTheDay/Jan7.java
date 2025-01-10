// Pair with given sum in a sorted array
/* 
Examples :

Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 2 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
*/
public class Jan7 {
    // static int countPairs(int[] arr, int target){
    // int cnt=0;
    // for(int i=0;i<arr.length;i++){
    // for(int j=i+1;j<arr.length;j++){
    // if(arr[i]+arr[j]==target)
    // cnt++;
    // }
    // }
    // return cnt;
    // }

    static int countPairs(int[] arr, int target) {
        int cnt = 0; // Counter for valid pairs
        int st = 0; // Start pointer
        int end = arr.length - 1; // End pointer

        while (st < end) {
            int curSum = arr[st] + arr[end]; // Current sum of two pointers

            if (curSum > target) {
                end--; // Move the `end` pointer left to reduce the sum
            } else if (curSum < target) {
                st++; // Move the `st` pointer right to increase the sum
            } else {
                int e1 = arr[st], e2 = arr[end]; // Current elements at st and end
                int c1 = 0, c2 = 0;

                // Count duplicates for arr[st]
                while (st <= end && arr[st] == e1) {
                    st++;
                    c1++;
                }

                // Count duplicates for arr[end]
                while (st <= end && arr[end] == e2) {
                    end--;
                    c2++;
                }

                // If both pointers point to the same element
                if (e1 == e2) {
                    cnt += (c1 * (c1 - 1)) / 2; // Combination formula
                } else {
                    cnt += c1 * c2; // Multiply occurrences of e1 and e2
                }
            }
        }

        return cnt; // Return the count of valid pairs
    }

    public static void main(String[] args) {
        // int[] arr={-1, 1, 5, 5, 7};
        // int target=6;
        int[] arr = { 1, 1, 1, 1 };
        int target = 2;
        System.out.println(countPairs(arr, target));
    }
}
