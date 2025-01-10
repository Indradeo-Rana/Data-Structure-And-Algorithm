package Arrays;

public class MaxmConsecutiveONE {
    static int pass(int[] arr){
        int max=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                max=Math.max(max, cnt);
            }
            else
                cnt=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr ={1,0,0,1,1,1,0,1,1};
        System.out.println("The maximum consecutive one is : "+pass(arr));
    }
}
