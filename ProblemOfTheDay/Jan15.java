import java.util.HashMap;
/*Why Sliding Window Won't Work Here?
Since the array contains negative numbers, the sliding window approach will not work.
So, we will solve this using the Prefix Sum + HashMap method. */
public class Jan15 {
    static int LongestSubArray(int []arr, int k){
        int maxLen=0;
        int sum=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=i+1;
            }
            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i -map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        // int[] arr={10,5,2,7,1,-10};
        // int k=15;
        int[] arr={94,-33,-13,40,-82,94,-33,-13,40,-82};
        int k=52;
        System.out.println(LongestSubArray(arr,k));
    }
}
