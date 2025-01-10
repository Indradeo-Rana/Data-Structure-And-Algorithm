package Arrays2D;

public class SwapColumn {
    public static void main(String[] args) {
        int[][] arr ={ {1,2,3} ,{4,5,6},{7,8,9}};
        
        int j=0;  // set col1 =0 
        int j1=arr[0].length-1;  // let fix last column (n-1 =2) in this case
        for(int i=0;i<arr.length;i++){  // rows will be changed 
            int temp = arr[i][j];
            arr[i][j]=arr[i][j1];
            arr[i][j1]=temp;
        }
        for(int i =0;i<arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
    }
}
