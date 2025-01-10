package Arrays;

//import java.util.HashMap;

public class TwoSum {

    // static String pass(int []arr, int target){
    //     HashMap<Integer,Integer> map= new HashMap<>();
    //     for(int i =0;i<arr.length;i++){
    //         int num = arr[i];
    //         int needMore= target-num;
    //         if(map.containsKey(needMore)){
    //             return "Yes";
    //         }
    //         else{
    //             map.put(num, i);
    //         }
    //     }

    //     return "no";
    // }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target= 9;

        //First Approach
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println("yes");
        //         }
        //     }
        // }

        // 2nd Approach

        //System.out.println(pass(arr,target));
    
        // LeetCode : Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] ans =pass(arr, target);
        for(int l:ans){
            System.out.print(l+" ");
        }
        
    }
    static int[] pass(int[] arr, int target ){
         int [] ans= new int[2];
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   ans[0]=i;
                   ans[1]=j;
                }
            }
        }
        return ans;
    }
}
