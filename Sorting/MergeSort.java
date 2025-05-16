package Sorting;
import java.util.*;
public class MergeSort {
    
    static void merge(int[] arr, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;
            merge(arr, left, mid);
            merge(arr, mid+1,right);
            mergeFun(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr={65,987,653,46,2,64,6,8};
        System.out.println("before arr is sorted :" + Arrays.toString(arr));
        merge(arr, 0, arr.length-1);
        System.out.println("After the sorted :" +Arrays.toString(arr));
    }
    static void mergeFun(int [] arr, int left, int mid, int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] leftArr= new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        int i=0;int j=0;int k=left;
        while (i<n1 && j<n2) {
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }
            else{
                arr[k++]=rightArr[j++];
            }
        }
        while (i<n1) {
            arr[k++]=leftArr[i++];
        }
        while (j<n2) {
            arr[k++]=rightArr[j++];
        }
    }
}
