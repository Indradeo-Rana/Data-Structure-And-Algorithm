package Arrays;
// Input Data Stream: 5, 15, 1, 3  
// Output: 5, 10,5, 4 
public class Median {
    public static void main(String[] args) {
        int [] arr ={5, 15, 1, 3  };
        int n = arr.length;
        int median =0;
        int sum=0;
        int count =0;
        for(int i =0;i<n;i++){
            sum += arr[i];
            count++;
            median =(int)Math.floor(sum/count);
            System.out.println(median);
        }
    }
}
