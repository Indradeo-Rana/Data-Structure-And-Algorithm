package String;
// return the total number of subarrays whose sum is equal to target
import java.util.HashMap;
import java.util.Map;
public class TotalSubArray {

    static int subArray(int[] arr , int target){
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - target)) {
            count += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr={10,2,-2,-20,10};
        int target=-10;
        System.out.println("Total possible target sub array is:  "+subArray(arr, target));
        System.out.println("here is another way " + Subrr(arr, target));
    }
    // different way to solve the problem
    static int Subrr(int[] arr, int target) {
       int cnt=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum=0;
       map.put(0, 1);
       for(int e : arr){
        sum+=e;

        if(map.containsKey(sum-target)){
            cnt+=map.get(sum-target);
        }
        if(map.containsKey(sum)){
            map.put(sum, map.get(sum)+1);
        }
        else{
            map.put(sum, 1);
        }
       }
       return cnt;
    }

}
