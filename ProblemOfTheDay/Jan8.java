// Count the number of possible triangles
/*Examples:

Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  
Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
Output: 6
Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]
Input: arr[] = [1, 2, 3]
Output: 0
Explanation: No triangles are possible. */
import java.util.Arrays;

public class Jan8 {
    // static int totalCount(int[] arr){
    //     int cnt=0;
    //     for(int i=0;i<arr.length-2;i++){
    //         for(int j=i+1;j<arr.length-1;j++){
    //             for(int k=j+1;k<arr.length;k++){
    //                 if(arr[i]+arr[j]>arr[k])
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }
    static int totalCount1(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int cnt = 0;

        // Start with the largest side as arr[i]
        for (int i = n - 1; i >= 2; i--) {
            int st = 0, end = i - 1;

            while (st < end) {
                // Check if the triangle property is satisfied
                if (arr[st] + arr[end] > arr[i]) {
                    cnt += (end - st); // All pairs between st and end are valid
                    end--; // Decrease end pointer
                } else {
                    st++; // Increase st pointer to find a larger sum
                }
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        // int[] arr ={10,21,22,100,101,200,300};
        int[] arr ={4,6,3,7};
        // System.out.println("possible ="+totalCount(arr));
        System.out.println("possible ="+totalCount1(arr));
    }
}
