package Arrays;

public class IsSorted {

    static boolean sorted(int[] arr){
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            //  if (arr[i] > arr[(i + 1) % n])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // first method => 2 for loop

        //boolean ans = true;
        // for (int i = 1; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] < arr[i])
        //             ans = false;
        //     }
        // }
        // if (ans == true) {
        //     System.out.println("Array is sorted");
        // } else {
        //     System.out.println("not");
        // }

        System.out.println(sorted(arr)); // 2nd method
    }
}
