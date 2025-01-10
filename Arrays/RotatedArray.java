package Arrays;

public class RotatedArray {

    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
      }
      public static void rotatedArr(int[] arr, int k) {
        int n= arr.length;
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // static void rotatedArr(int[] arr, int k){
    //   int n = arr.length;
    //   int i=0;int j=n-1;
    //   Reverse(arr,i,j);
    //   Reverse(arr,i,j-k);
    //   Reverse(arr,n-k,n-1);
    //   for(int a =0;a<n;a++){
    //     System.out.print(arr[a]+" ");
    //   }
    // }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        rotatedArr(arr,k); // right 4 5 1 2 3 
        // rotatedArr(arr,k);  left 3 4 5 1 2 
    }
}