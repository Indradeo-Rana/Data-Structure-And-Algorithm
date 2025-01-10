package Arrays;
public class TripletsSum {
    static int tripletsSum(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(arr[i]+arr[j]+arr[k]==target){
        //                 ans++;
        //             }
        //         }
        //     }
        // }
        
        // O(n^2) approach
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<target){
                    left++;
                }else if(sum>target){
                    right--;
                }
                else{
                    int e1=arr[left], e2=arr[right], c1=0,c2=0;
                   while (left<=right && arr[left]==e1) {
                    c1++;
                    left++;
                   }
                   while (left<=right && arr[right]==e2) {
                    c2++;
                    right--;
                   }
                   if(e1==e2){
                    ans+=(c1*(c1-1))/2;
                   }else{
                    ans+=c1*c2;
                   }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {-3,-1,-1,0,1,2};
        int target=-2;
        System.out.println(tripletsSum(arr,target));
    }
}
