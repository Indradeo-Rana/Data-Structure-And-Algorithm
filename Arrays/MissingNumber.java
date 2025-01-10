package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a= {1,2,3,5,6};
        int n= 6;
        int totalSum=0;
        int sum=n*(n+1)/2;
        for(int i:a){
            totalSum+=i;
        }
        System.out.println(sum-totalSum);
    }
}
