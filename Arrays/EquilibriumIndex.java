package Arrays;

public class EquilibriumIndex {

    static int equiliIndex(long[] arr ){
            long leftSum=0;
            long totalSum =0;
            for(int i =0;i<arr.length;i++){
                totalSum += arr[i];
            }
            for(int i=0;i<arr.length;i++){
                long rightsum = totalSum- leftSum- arr[i];
                if(rightsum == leftSum)
                    return i+1;
                leftSum += arr[i];
        }
        return -1;
    }

    public static int equilibriumPoint(long[] arr)
    {
        int n = arr.length;
        long leftsum, rightsum;

        /* Check for indexes one by one until
           an equilibrium index is found */
        for (int i = 0; i < n; ++i) {
            /* get left sum */
            leftsum = 0;
            for (int j = 0; j < i; j++)
                leftsum += arr[j];
            /* get right sum */
            rightsum = 0;
            for (int j = i + 1; j < n; j++)
                rightsum += arr[j];
            /* if leftsum and rightsum
               are same, then we are done */
            if (leftsum == rightsum)
                return i ;
        }
        return -1;
    } 
    // Driver code
    public static void main(String[] args)
    {
        // Sample Input
        long[] arr = { -7, 1, 5, 2, -4, 3, 0 }; // ans => 3

        // Function call
        //System.out.println(equilibriumPoint(arr));
        System.out.println(equiliIndex(arr));
    }
    
}
