public class Jan17 {

    // Product array puzzle

    static int[] product(int[] arr){ // 1,2,3,4
        int n=arr.length;  // n =4
        int[] ans = new int[n]; //ans [ ,  ,  ,  ,]
        ans[0]=1;  //ans[0] [1 ,  ,  ,  ,]
        for(int i=1;i<n;i++){ // 4<4
            ans[i]=ans[i-1]*arr[i-1];  //i=1,ans[2] [1 , 1 , 2 , 6 ,]
        }
        int pr=1;   // pr=12
        for(int i=n-1;i>=0;i--){ // i == 2,1,0
            ans[i]=ans[i]*pr; //ans [ ,  ,  ,  ,]
            pr*=arr[i]; // 3*4=12
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] arr = {0,12};
        int [] arr={1,2,3,4};
        int[] ans=product(arr);
        for(int i: ans){
            System.out.print(i+" ");
        }


        // int[] arr = {10,3,5,6,2};
        // int pr=1;
        // for(int i=0;i<arr.length;i++){
        //     pr*=arr[i];
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(pr/arr[i]+" ");
        // }
       
    }
}
