package Sorting;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Bubble {
    static void bubble(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int n=sc.nextInt();
        int[] arr=new int[n];
        Random rn= new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=rn.nextInt(100);
        }
        sc.close();
        System.out.println("Original array: "+Arrays.toString(arr));
        long startTme=System.nanoTime();
        bubble(arr);
        long end=System.nanoTime();
        double total=(end-startTme)/1e9;
        System.out.println("After sorting the array : "+Arrays.toString(arr));
        System.out.printf("n=%d, time taken= %f ", n ,total);
    }
}
