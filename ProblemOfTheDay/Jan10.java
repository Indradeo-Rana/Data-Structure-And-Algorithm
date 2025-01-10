import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Jan10 {      
    static void pass(int[] arr, int k) {// 8,6,10       // 1
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <n- k+1; i++) {
            HashSet<Integer> map = new HashSet<>();
            int jcnt = 0;
            for (int j = i; j < n; j++) {
                if (jcnt != k) {
                    map.add(arr[j]);
                    jcnt++;
                } else {
                    break;
                }
            }
            ans.add(map.size());
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
        // int k = 4;
        int[] arr ={8,6,10};
        int k = 1;
        //  pass(arr, k);
        ArrayList<Integer> res =slidingWindow(arr, k);
        System.out.println(res);
    }
    static ArrayList<Integer> slidingWindow(int[] arr , int k){
        int n =arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        // !st approach
        for(int i=k;i<n;i++){
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            ans.add(map.size());
        }
        return ans;
    }
}


/*
 ArrayList<Integer> ans= new ArrayList();
 Map<Integer,Integer> mp = new HashMap();
 k--;
 for(int i=0;i<k;i++){
     mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
     if(i<k){
     continue;
     }
     ans.add(mp.size());
     if(mp.get(arr[i-k])==1){
         mp.remove(arr[i-k]);
     }else{
            mp.put(arr[i-k],mp.get(arr[i-k])-1);
    }
 }
 */