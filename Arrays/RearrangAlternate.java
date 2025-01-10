package Arrays;

import java.util.ArrayList;

public class RearrangAlternate {
//      Input:
//              arr[] = {1,2,-4,-5}
//              N = 4
//       Output:
//              1 -4 2 -5
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5};
        int n= arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i: arr){
            if(i>0)
                pos.add(i);
            else
                neg.add(i);
        }
        for(int i=0;i<n/2;i++){
      
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        for(int i:arr){
            System.out.println(i);   

        }
    }
}
