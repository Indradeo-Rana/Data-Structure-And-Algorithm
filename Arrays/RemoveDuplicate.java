package Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    static void hashMethod(int [] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.print(set);
    }

    static int duplicate(int [] arr, int n){
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) { //i-> 1 !=j-> 2
                i++;                  // i=1
                arr[i] = arr[j];     // arr[i]= 0->1, 1-2,
            }
        }
        return i + 1;
    }
        
    
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        int n=arr.length;

        // using hashSet
        hashMethod(arr,n);

        // using loop
        int k= duplicate(arr,n);

       for(int i=0;i<k;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
