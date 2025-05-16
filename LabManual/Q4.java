import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Q4 { // Q4 == ByInsertionMethod
    
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n=sc.nextInt();
        sc.close();

        Random rdm=new Random();
        int[] reEle=new int[n];
        for(int i=0;i<n;i++){
            reEle[i]=rdm.nextInt(10000);
        }
        System.out.println("Original Array : "+ Arrays.toString(reEle));
        long startTime=System.nanoTime();
        insertionSort(reEle);
        long endTime=System.nanoTime();
        double totalTime=(endTime-startTime)/1e9;
        System.out.printf("n=%d,sort time:%.6f seconds%n",n,totalTime);
        System.out.println("sorted array:" +Arrays.toString(reEle));
    }
}
// 0.000154 0.001858 0.000359 0.001841

// n=100,sort time:0.000374 seconds
// n=50,sort time:0.000051 seconds
// n=200,sort time:0.000947 seconds
// n=300,sort time:0.001355 seconds
// n=250,sort time:0.000781 seconds