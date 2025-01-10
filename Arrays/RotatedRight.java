package Arrays;

public class RotatedRight {
    static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    static void afterRotated(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n - 1);
        System.out.println();
        for(int i =0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int[] a = { 1, 2,3, 4,5 };
        int k = 2;
        afterRotated(a, k);
        afterRotated(arr, k);
    }
}
