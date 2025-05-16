package Arrays2D;

public class RotatedAntiClockWise {
    
public static void main(String[] args) {
    int arr[][] = { {1,2,3}, {4,5,6},{7,8,9}};
    // calling the function
    rotatedAntiClock(arr);
}

// defining the function
static void rotatedAntiClock(int[][] arr){
    int n=arr.length;

    // for transpose
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }

     // reverse
     for(int j=0;j<n;j++){
        for(int i=0,k=n-1;i<k;i++,k--){
            int temp=arr[i][j];
            arr[i][j]=arr[k][j];
            arr[k][j]=temp; 
        }
     }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}
