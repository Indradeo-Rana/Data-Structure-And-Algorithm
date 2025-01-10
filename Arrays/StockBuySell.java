package Arrays;

public class StockBuySell {
//      Input:
//               prices = [7,6,4,3,5]
//      Output:
//               2
//     approach 1 n^2;
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1  ,9  };
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        // int min=Integer.MAX_VALUE;
        // for( int i =0;i<arr.length;i++){
        //     min=Math.min(min, arr[i]);
        //     maxPro=Math.max(maxPro, arr[i]-min);
        // }
        System.out.println(maxPro);
    }
}
