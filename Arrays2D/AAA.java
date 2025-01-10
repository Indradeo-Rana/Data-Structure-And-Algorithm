package Arrays2D;

public class AAA {
    static void display(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

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
        display(arr);
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4,5,6 }, { 7,8,9 } ,{3,6,9}};
        System.out.println("original array : ");
        display(arr);
      shiftUp(arr);
    }
}
