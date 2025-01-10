package Arrays;

import java.util.HashSet;

public class Duplicates {

    static int find(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 2, 5, 3 };
        int[] arr = { 1, 2, 3, 1, 4, 5, 2 };
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println("Duplicate element is :" + duplicate);
        System.out.println(find( a));
    }
}
