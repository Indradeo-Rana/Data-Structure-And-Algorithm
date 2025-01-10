package Arrays2D;

public class ShiftUpRowCol {
    static void printArr(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+"  ");
            }
            System.out.println();
        }
    }

    static void shiftColUp(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length-1;col++){
                int temp=arr[row][col];
                arr[row][col]=arr[row][col+1];
                arr[row][col+1]=temp;
            }
        }
        printArr(arr);
    }
    static void shiftUp(int[][] arr){
        for(int row=0;row<arr.length-1;row++){
            for(int col=0;col<arr[0].length;col++){
                int temp=arr[row][col];
                arr[row][col]= arr[row+1][col];
                arr[row+1][col]=temp;
            }
        }
        System.out.println("After shifted up array will be ");
        printArr(arr);
    }
    public static void main(String[] args) {
        int[][] arr = { { 1,2,3,4},{3,4,5,6},{4,5,6,7},{6,7,8,9}};
        System.out.println("Original array..");
        printArr(arr);
        System.out.println("After shifting array of col one step ahead..");
        // shiftColUp(arr);
        shiftUp(arr);
    }
}
