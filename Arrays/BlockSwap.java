package Arrays;
//Block swap algorithm for array rotation

public class BlockSwap {

    static void swap(int[] arr, int aIndex, int bIndex, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = arr[aIndex + i];
            arr[aIndex + i] = arr[bIndex + i];
            arr[bIndex + i] = temp;
        }
    }

    public static int[] arrLeftRotate(int[] arr, int r, int n) {
        if (r == n || r == 0)
            return arr;
        int A = r, B = n - r;
        while (A != B) {
            if (A < B) {
                swap(arr, r - A, r - A + B, r);
                B = B - A;
            } else {
                swap(arr, r - A, r, B);
                A = A - B;
            }
        }
        swap(arr, r - A, r, A);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int r = 2;
        int n = arr.length;

        arr = arrLeftRotate(arr, r, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}