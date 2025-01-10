package Arrays;
//  example= {1,0,2,1,0,2}
// output = 0,0,1,1,2,2
public class DutchNationalFlagAlgo {

    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,2};
        // Approach 1 
        // count 0,1 and 2 and then fill

        // Dutch National Flag Algo
        int n=arr.length;
        int low=0, mid=0, high= n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int tem=arr[mid];
                arr[mid]=arr[high];
                arr[high]=tem;
                high--;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
