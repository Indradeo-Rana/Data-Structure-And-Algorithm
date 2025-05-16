package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class InsertionSort {
    public static void insertion(int []arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        // random array generation
        Random rand= new Random();
        int []arr = new int[n];
        sc.close();
        for (int i = 0; i < n; i++) {
            arr[i]=rand.nextInt(100000);   
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
        // mearusing the time taken by the algorithm to sort the array
        long startTme = System.nanoTime();
        insertion(arr);
        long endTime = System.nanoTime();
        double sortTime = (endTime-startTme)/1e9;
        System.out.printf("n=%d, Time taken: %.6f\n",n,sortTime);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }

}