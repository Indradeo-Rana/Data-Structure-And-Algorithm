package Arrays;
// using making frequency and using hashset
public class CountFreqEach {
    public static void main(String[] args) {
        int []arr ={1,2,3,6,2,6,5,4};
        int [] freq= new int[8];
        for(int i=0 ;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i: freq){
            System.out.print(i+" ");
        }
    }
}
