import java.util.HashMap;

public class Jan16 {
    static int count(int[] arr) {
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            int Zsum = 0;
            int Osum = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0)
                    Zsum++;
                else
                    Osum++;
                if (Zsum == Osum)
                    maxi = Math.max(maxi, (j - i + 1));
            }
        }
        return maxi;
    }
public static int count1(int[] arr ){
    // Replace 0 with -1
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            arr[i] = -1;
        }
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0, maxLength = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        // If sum becomes 0, subarray from 0 to i has equal 0s and 1s
        if (sum == 0) {
            maxLength = i + 1;
        }

        // If sum is already seen, update maxLength
        if (map.containsKey(sum)) {
            maxLength = Math.max(maxLength, i - map.get(sum));
        } else {
            map.put(sum, i); // Store first occurrence of the sum
        }
    }

    return maxLength;
}
public static int count2(int[] arr){
    HashMap<Integer,Integer> map= new HashMap<>();
    map.put(0, 1);
    int sum=0;int ans=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i]==1 ? 1:-1;
        if (map.containsKey(sum)) {
            ans = Math.max(ans, i - map.get(sum));
        } else {
            map.put(sum, i); // Store first occurrence of the sum
        }
    }

    return ans;
}
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
        System.out.println();
        System.out.println("Ans= " + count2(arr));
    }
}