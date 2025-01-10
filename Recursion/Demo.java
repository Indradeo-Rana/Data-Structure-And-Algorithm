package Recursion;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {4,-6,2,8};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                for(int k =j;k<arr.length;k++){
                    System.out.print(arr[k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println(" ");
        }
    }
}
