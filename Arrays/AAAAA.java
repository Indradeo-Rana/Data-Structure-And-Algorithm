package Arrays;

public class AAAAA {
   // Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
   // Output: 3
   public static void main(String[] args) {
      // int [] arr={0,1,2,1,0,2};
      int [] arr={5, 2, 3, 10, 6, 8};
      int target=10;
      int cnt=0;
      for(int i=0;i<arr.length;i++){  
         int sum=0;                   
         for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            if(sum==target){
               cnt++;
               //  System.out.println(j);
            }
            if(sum>target){
               break;
            }
         }
      }
      System.out.println("total sum 10: "+cnt);
   }
}