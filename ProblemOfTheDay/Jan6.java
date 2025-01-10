
/*
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25. 
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Jan6 {
    static List<Integer> sumClosest(int [] arr, int target){
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(arr);
        int left =0;
        int right=arr.length-1;
        int currClose=Integer.MAX_VALUE;
        while(left<right){
            int sum =arr[left]+arr[right];
            if(Math.abs(target-sum)<currClose){
                currClose=Math.abs(target-sum);
                ans.clear();
                ans.add(arr[left]);
                ans.add(arr[right]);
            }
            if(sum>target){
                right--;
            }
            else if(target>sum){
                left++;
            }
            else{
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int [] arr={10,20,30,5};
        // int target=25;
        int[] arr={4,5,2,7,1};
        int target=10;
       List<Integer> ans= sumClosest(arr,target);
       System.out.println(ans);
    }
}
