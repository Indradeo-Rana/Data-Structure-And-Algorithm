package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSuccessiveEle {
    // approach 1 =>
    static boolean linearSearch(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    static int approach1(int[] a, int n) {
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            while (linearSearch(a, x + 1) == true) {
                x += 1;
                cnt += 1;
            }
            maxLen = Math.max(maxLen, cnt);
        }
        return maxLen;
    }
// 2nd approach 
 public static int longestSuccessiveElements(int []a,int n) {
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    
    // 3rd approach
    static int  longestSuccessiveElement(int [] a, int n){
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int n = arr.length;
        //System.out.println(approach1(arr, n));
         System.out.println(longestSuccessiveElements(arr,n));
        // System.out.println(longestSuccessiveElement(arr,n));

    }
}
