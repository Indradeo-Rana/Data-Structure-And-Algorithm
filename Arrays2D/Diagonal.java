package Arrays2D;

public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3}, {4,5,6},{7,8,9} };
        System.out.println("Diagonal of 2d array is ..");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i+j == arr.length-1)
                    System.out.print(arr[i][j]+"  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
