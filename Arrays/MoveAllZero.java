package Arrays;

import java.util.ArrayList;

public class MoveAllZero {

    // Input: nums = [0,1,0,3,12]
    // Output: [1,3,12,0,0]
    static void ByArrayMethod(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        int n = list.size();
        for(int i=n;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int count=0;
        for(int i =0;i<arr.length;i++){
           if(arr[i]!=0){
            arr[count]=arr[i];
            count++;
           }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\nBY method wala");
        // other method
        ByArrayMethod(arr);

    }
}
