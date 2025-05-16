public class Jan14 {
    /*
     * Input: arr[] = [1, 2, 0, 3]
     * Output: 2
     * Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of
     * index 2 is 0 + 3 = 3.
     * Input: arr[] = [1, 1, 1, 1]
     * Output: -1
     * Explanation: There is no equilibrium index in the array.
     */
    public static void main(String[] args) {
        // int arr[]= {1,1,1,1};
        int arr[]= {1,2,0,3};
        System.out.println(equilibrium(arr));
    }
    static int equilibrium(int[] arr ){
        int n= arr.length;
        int total = 0 ;
        int left=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        for(int i=0;i<n;i++){
            int right = total - left -arr[i];
            if(left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
