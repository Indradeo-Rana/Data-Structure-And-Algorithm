package Arrays;

public class SampleCode {
    static void sot(int[] arr,int n){
        int sum;
        int maxSum=0;
        for(int i =0;i<n;i++){ // i=0
            sum=0;
            for(int j=i;j<n;j++){   // j=0
                sum +=arr[j];  //sum=-1+
            
            maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        sot(arr, n);
        // for(int i:arr){
        // System.out.print(i+" ");
        // }
    }
}
