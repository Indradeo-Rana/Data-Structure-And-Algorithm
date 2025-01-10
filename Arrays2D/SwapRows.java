package Arrays2D;

public class SwapRows {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3} ,{ 1,1,3}, { 3,2,5},{7,8,9}};
        int row1=0;
        int lastRow=arr.length-1;
        for(int col=0;col<arr[0].length;col++){
            int temp =arr[row1][col];
            arr[row1][col]=arr[lastRow][col];
            arr[lastRow][col]=temp;

        }
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
