package SlidingWindow;
// constant window
public class ConstantWindow {
    public static void main(String[] args) {
        // int[] arr ={-1,2,3,3,4,5,-1};        // our task is to print max four consucutive  sum 
        int [] arr={1,2,-3,4,2};
        int k=3; // only k consecutive sequence ie. size of the window is fixed
        int n=arr.length;
        int sum=0;
        int maxi=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int l=0;
        int r=n-k;
        while (r<n-1) {
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
        
        maxi=Math.max(sum, maxi);
        }
         System.out.println(maxi);

        System.out.println("here is another way to solve .");
        System.out.println("the maximum sum : "+pass(arr, k));
    }
    static int pass(int [] arr, int k){
        int n=arr.length;
        //edge case
        if(k>arr.length)
            return -1;
        // calculating sum of the given k th index
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        // moving left and right by one till r<arr length
        // int l=0,r=n-k;
        // while (r<n-1) {
        //     sum= sum-arr[l];
        //     l++;r++;
        //     sum= sum+arr[r];
        //     maxSum=Math.max(maxSum, sum);
        // }

        //  slide the window
        for(int i=k;i<n;i++){
            sum=+ arr[i] -arr[i-k];  
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
