package Arrays;

// import java.util.Map.Entry;
// import java.util.HashMap;

public class MooreVotingAlgo {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 3 };
        int n = arr.length;

        // !st apporach -> pick one ele and count its occurance and check greater than n/2.
        // for (int i = 0; i < n; i++) {
        // int cnt = 0;
        // for (int j = i; j < arr.length; j++) {
        // if (arr[j] == arr[i])
        // cnt++;
        // if (cnt > n / 2)
        // System.out.print(arr[i]);
        // }
        // }

        // 2nd Approach -> using hashMap whose occurance is more than comapre

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for( int i=0;i<n;i++){
        // int value = map.getOrDefault(arr[i], 0);
        // map.put(arr[i], value + 1);
        // }
        // for(Entry<Integer,Integer> id:map.entrySet()){
        // if(id.getValue()>n/2){
        // System.out.println(id.getKey());
        // }
        // }

        // 3d app Moore Votng Algo

        int cnt = 0; // count
        int el = 0; // Element

        // applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i])
                cnt++;
            else
                cnt--;
        }
        // checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el)
                cnt1++;
        }
        if (cnt1 > (n / 2)) {
            System.out.println(arr[el]);
        }
    }
}
