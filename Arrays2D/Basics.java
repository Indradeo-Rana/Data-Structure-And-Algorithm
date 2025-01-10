package Arrays2D;

public class Basics {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int rows = arr.length; // => number of rows
        int columns = arr[0].length; // => number of columns

        System.out.println("2d array will be");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (rows == 1 || columns == 1)
                    arr[i][j] = 0;
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
