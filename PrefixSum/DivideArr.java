public class DivideArr {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 5, 8, 20, -10, 8 };
        // int[] arr = { 5,-2, 7, 3, -2, 5, 4 };
        int n = arr.length;
        // boolean ans = false;

        for (int i = 0; i < n - 1; i++) {
            int leftSum = 0;
            int right = 0;
            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < n; k++) {
                right += arr[k];
            }
            if (right == leftSum) {
                // System.out.println("leftSum: "+leftSum+" rightSum: "+right);
            }
        }
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int prefix=0;
        int ans=0;
        for(int i=0;i<n-1;i++){
            prefix+=arr[i];
            ans= totalSum-prefix;
            if(prefix==ans){
                System.out.println("possible");
            }else
            System.out.println("no");
        }
    }
}
