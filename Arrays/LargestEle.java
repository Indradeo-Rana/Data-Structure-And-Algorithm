package Arrays;

public class LargestEle {
    static int maxEle(int [] arr){
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,5,65,23,8};
        // Appoarch 1 => sort the array

        // 2nd approach
        System.out.println(maxEle(arr));
    }
}
