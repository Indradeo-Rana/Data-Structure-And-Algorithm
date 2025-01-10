package Arrays;

//     example = [1,2,3,2,1] ==> return 3 because 3 is unique

public class SingleElement {
    static int pass(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) 
                    count++;
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 1, 2 };
        System.out.println(pass(arr));
    }
}
