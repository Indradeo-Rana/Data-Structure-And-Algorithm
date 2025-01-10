package Arrays;

import java.util.Arrays;

public class SecondLargestEle {

    static  void getElements(int[] arr,int n) {
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }

    static void maxMin(int[] arr , int n){
        int fst_max=Integer.MIN_VALUE;
        int fst_min=Integer.MAX_VALUE;
        int snd_max=Integer.MIN_VALUE;
        int snd_min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>fst_max){
                fst_max=arr[i];
            }
            if(arr[i]<fst_min){
                fst_min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=fst_max){
                if(arr[i]>snd_max){
                    snd_max=arr[i];
                }
            }
            if(arr[i]!=fst_min){
                if(arr[i]<snd_min){
                    snd_min=arr[i];
                }
            }
        }
        System.out.println("first Maximum element :"+fst_max);
        System.out.println("second Maximum element :"+snd_max);
        System.out.println("first Mimimum element :"+fst_min);
        System.out.println("second Mimimum element :"+snd_min);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        int n = arr.length;
        // getElements(arr,n); // using sorting method here
        maxMin(arr, n);
    }
}
